package javaalgorithms.dynamic;

/**
 * The problem is to maximize profit while cutting a rod 
 * The rod is of a given size
 * The prices of each smaller size of rod is given
 * 
 * @author manishpeshwani
 *
 */
public class RodCuttingProblem {

	public static void main(String[] args) {
		int totalSize = 8;//This is the rod size
		//int[] prices = {1,5,8,9,10,17,17,20};//Prices of rods
		int[] prices = {3,   5,   8,   9,  10,  17,  17,  20};
		
		int[][] solution = new int[prices.length+1][totalSize+1];
		
		int maximumProfit = 0;
		
		for(int i=0;i<prices.length+1;i++){
			for(int j=0;j<totalSize+1;j++){
				//If there is no rod available then maximum profit is 0
				if(j == 0){
					solution[i][j] = 0;
					continue;
				}
				
				if(i == 0){
					solution[i][j] = 0;
					continue;
				}
				
				//If there is only 1 length available then 
				if(i == 1){
					solution[i][j] =  prices[i-1]*j;
					if(maximumProfit < solution[i][j]){
						maximumProfit = solution[i][j];
					}
					continue;
				}
				
				if(j < i){
					solution[i][j] = solution[i-1][j];
				}else {
					int value = prices[i-1] + solution[j-i][j-i];
					solution[i][j] = Math.max(value, solution[i-1][j]);
					
				}
				if(maximumProfit < solution[i][j]){
					maximumProfit = solution[i][j];
				}
			}
		}
		
		for(int i=0;i<prices.length+1;i++){
			for(int j=0;j<totalSize+1;j++){
				System.out.print(solution[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println(maximumProfit);

	}

}
