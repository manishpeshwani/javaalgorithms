package javaalgorithms.backtracking;

public class RatInTheMaze {

	public static void main(String[] args) {
		
		int n = 4;
		
		int[][] grid = populateGrid();
		
		int[][] soln = new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				soln[i][j] = 0;
			}
		}
		
		solveMaze(n, 0, 0, grid, soln);
		
		printSoln(n, soln);

	}
	
	public static void printSoln(int n, int[][] soln){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(soln[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static boolean solveMaze(int n, int row, int col, int[][] grid, int[][] soln){
		
		//If the mouse has reached the last cell, then the soln is achieved
		if(row == n-1 && col == n-1){
			soln[row][col] = 1;
			return true;
		}
		
		//Is it safe for the mouse to move to the cell
		//If yes, then set the move in the soln grid and try moving down (row + 1)
		//If moving down is not possible, move forward (col + 1)
		//If the mouse cant move down or forward, back track by marking the cell in soln grid as 0;
		if(isSafe(n, row, col, grid)){
			soln[row][col] = 1;
			
			if(solveMaze(n, row+1, col, grid, soln)){
				return true;
			}
			
			if(solveMaze(n, row, col+1, grid, soln)){
				return true;
			}
			
			//Backtrack
			soln[row][col] = 0;
		}
		
		return false;
	}
	
	public static boolean isSafe(int n, int row, int col, int[][] grid){
		if(row >= 0 && row <n && col >= 0 && col < n && grid[row][col] == 1 ){
			return true;
		}
		
		return false;
	}
	
	public static int[][] populateGrid(){
		int maze[][] = {{1, 0, 0, 0},
	            {1, 1, 0, 1},
	            {0, 1, 0, 0},
	            {1, 1, 1, 1}
	        };
		
		return maze;
	}

}
