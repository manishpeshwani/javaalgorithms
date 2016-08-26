package javaalgorithms.dynamic;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * You have the prices of n dresses arranged in a line. You have to select any number of dresses such as to get the max sum of prices. But, You cannot choose adjacent dresses.

Input Format

First line contains an integer n. The next line contains n integers which denote the prices of the n dresses.

Example: 4 3 4 5 10

Constraints: n <= 100000 each of the prices < 10e9

Output Format

One integer which is the max price you could obtain by choosing the set of dresses optimally.

Sample Input

4
3 4 5 10
Sample Output

14

Explanation

select 4 and 10
 */
public class SpendthriftShopper {
	

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream(new File("C://Users/manishpeshwani/Desktop/input05.txt"));
		
		Scanner scanner = new Scanner(fis);
		
		int n = scanner.nextInt();
		
		
		long[] prices = new long[n];
		
		for(int i=0;i<n;i++){
			prices[i] = scanner.nextInt();
		}
		
		
		
		Map<Integer, Long> prevBestResult = new HashMap<Integer, Long>();
		
		maxPrice(prevBestResult, prices);
		
		System.out.println(prevBestResult.get(prices.length-1));

	}
	
	public static void maxPrice(Map<Integer,Long> prevResults, long[] prices){
		
		for(int i=0; i<prices.length;i++){
			if(i<2){
				//If you are at the first or second element then you can only pick that element
				prevResults.put(i, prices[i]);
				continue;
			}
			
			long currentMaxPrice = 0;
			//Start from i - 2 as you cannot pick i - 1 th (adjacent) item
			//For each level add the max price that was calculated at that level to the current price
			//If the sum of current price and previous best price is max, store it in currentMaxPrice variable
			for(int j=i-2;j>=0;j--){
				long value = prices[i] + prevResults.get(j);
				if(value > currentMaxPrice){
					currentMaxPrice = value;
				}
			}
			//At this stage, you have found the max price at current level, store it in the prevResults map
			prevResults.put(i, currentMaxPrice);
		}
		
	}

}
