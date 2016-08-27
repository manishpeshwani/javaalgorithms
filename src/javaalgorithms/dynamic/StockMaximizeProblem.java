package javaalgorithms.dynamic;

public class StockMaximizeProblem {

	public static void main(String[] args) {
		int[] prices = new int[]{2,5,7,1,4,3,1,3};
		
		int[][] soln = new int[prices.length + 1][prices.length];
		
		maximizeProfit(prices, soln);
		
		for(int i=0;i<prices.length+1;i++){
			for(int j=0; j<prices.length;j++){
				System.out.print(soln[i][j]);
				System.out.print(" " );
			}
			
			System.out.println();
		}
		

	}
	
	public static void maximizeProfit(int[] prices, int[][] soln){
	
		for(int i=0;i<prices.length+1;i++){
			for(int j=0; j<prices.length;j++){
				if(i==0){
					//If no transactions, no profit 
					soln[i][j] = 0;
					continue;
				}
				
				//If only one day, you cant make any profit
				if(j == 0){
					soln[i][j] = 0;
					continue;
				}
				
				int profitWithoutTransacting = soln[i][j-1];
				
				int maxProfit = 0;
				
				//Calculate profit if we sell on current day and sell on mth day
				//m goes from 0 to (current day -1)
				for(int m=0;m<=j-1;m++){
					int profit = (prices[j] - prices[m]) + soln[i-1][m];
					if(profit > maxProfit){
						maxProfit = profit;
					}
				}
				
				soln[i][j] =  Math.max(profitWithoutTransacting, maxProfit);
			}
		}
	}

}
