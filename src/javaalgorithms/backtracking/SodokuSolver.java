package javaalgorithms.backtracking;

public class SodokuSolver {

	public static void main(String[] args) {
		int n = 9;
		int[][] grid = 	populateGrid();
		
		
		
		solveSodoku(n, grid);
		
		for(int i=0;i<n;i++){
			for(int j=0; j<n;j++){
				System.out.print(grid[i][j]);
				System.out.print(" " );
			}
			System.out.println();
		}

	}
	
	public static boolean solveSodoku(int n, int[][] grid){
		
		int row = -1;
		int col = -1;
		
		for(int i=0;i<n;i++){
			for(int j=0; j<n;j++){
				if(grid[i][j] == 0){
					row = i;
					col = j;
					break;
				}
			}
		}
		
		if(row == -1 || col == -1){
			return true;//bottom condition
		}
		
		for(int i=1;i<=9;i++){
			if(isSafe(i, n, row, col, grid)){
				grid[row][col] = i;
				if(solveSodoku(n, grid)){
					return true;
				}
			}
			
			grid[row][col] = 0;
		}
		
		return false;
	}
	
	
	public static boolean isSafe(int value, int n, int row, int col, int[][] grid){
		//Check in row
		for(int i=0;i<n;i++){
			if(grid[row][i] == value){
				return false;
			}
		}
		
		//Check in col
		for(int i=0;i<n;i++){
			if(grid[i][col] == value){
				return false;
			}
		}
		
		//Check in the box
		//if row is 4 i.e. 5th row then (4 - 4%3) which is 3 is the start row  
		int startRow = row - row%3;
		int startCol = col - col%3;
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(grid[startRow + i][startCol + j] == value){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static int[][] populateGrid(){
		 int[][] grid = new int[][]
				{
				{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};
                
          return grid;      
	}

}
