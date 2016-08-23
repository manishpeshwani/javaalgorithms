package javaalgorithms.backtracking;

//Place the queens in each row in an nxn matrix such that all the queens are safe from all other queens.
public class NQueenProblem {

	public static void main(String[] args) {
		int n = 6;
		
		int[][] solution = new int[n][n];
		
		//Populate all the cells with 0s
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				solution[i][j] = 0;
			}
		}
		
		//Call the placeQueens method with row set to 0 i.e first row
		placeQueens(n, 0, solution);
		
		//Print the matrix after the queens are placed
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(solution[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}

	}
	
	
	public static boolean placeQueens(int n, int row, int[][] solution){
		
		//If we have reached last row, then return true
		if(row >= n){
			return true;
		}
		
		for(int col=0; col<n; col++){
			//If the cell is safe, then place the queen and call placeQueen for next row
			if(isSafe(n, row, col, solution)){
				solution[row][col] = 1;//Place the queeen
				if( placeQueens(n, row+1, solution)){
					return true;
				};
			}
			
			//If we have reached here means it is not safe to place the queen backtrack
			solution[row][col] = 0;
		}
		
		return false;
	}
	
	public static boolean isSafe(int n, int row, int column, int[][] solution){
		
		boolean isSafe = true;
		
		//If there is a queen in the column in any of the rows above this row, then it is unsafe
		for(int i=0;i<row;i++){
			if(solution[i][column] == 1){
				isSafe = false;
				return false;
			}
		}
		
		int rightDiagonal = row + column;
		int leftDiagonal = row - column;
		
		//For right top diagonal the sum of row and col is always equal
		for(int i=0;i<row;i++){
			for(int j=0;j<n;j++){
				//If there is a queen in the right top diagonal, then it is not safe to place the queen in current cell
				if(i+j == rightDiagonal){
					if(solution[i][j] == 1){
						isSafe = false;
						return isSafe;
					}
				}
				
				//If the difference of current row and col is same as the 
				//difference in row and col where the queen is placed then it is not safe
				if(i-j == leftDiagonal){
					if(solution[i][j] == 1){
						isSafe = false;
						return isSafe;
					}
				}
			}
		}
		
		//If the current cell is not under attack then return true
		return isSafe;
		
	}

}
