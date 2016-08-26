package javaalgorithms.dynamic;

import java.util.Scanner;

/*
 * 
 *
Sample Input

4 5
1 8
2 4
3 0
2 5
2 3
Sample Output

13
 */

public class KnapsackProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int totalAllowedCapacity = scanner.nextInt();
		int totalItemsAvailable = scanner.nextInt();
		
		int[] weights = new int[totalItemsAvailable+1];
		int[] values = new int[totalItemsAvailable+1];
		
		weights[0] = 0;
		values[0]  = 0;
		
		for(int i=1; i<totalItemsAvailable+1; i++){
			weights[i] = scanner.nextInt();
			values[i]  = scanner.nextInt();
		}
		
		int[][] soln = new int[weights.length][totalAllowedCapacity+1];
		
		int maxValue = -1;
		
		for(int i=0;i<weights.length;i++){
			for(int j=0;j<totalAllowedCapacity+1;j++){
				if(i==0){
					soln[i][j] =0;
					continue;
				}
				
				if(j==0){
					soln[i][j] =0;
					continue;
				}
				
				if(weights[i]<=j){
					int value = Math.max(values[i] + soln[i-1][j-weights[i]], soln[i-1][j]);
					soln[i][j] = value;
					
					if(value > maxValue){
						maxValue = value;
					}
				}else{
					int value = soln[i-1][j];//Dont select the current item
					soln[i][j] = value;
					if(value > maxValue){
						maxValue = value;
					}
				}
			}
		}
		
		System.out.println(maxValue);
		
		for(int i=0;i<weights.length;i++){
			for(int j=0;j<totalAllowedCapacity+1;j++){
				System.out.print(soln[i][j]);
				System.out.print(" ");
			}
			
			System.out.println();
		}

	}
	
	

}
