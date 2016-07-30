package javaalgorithms;

import java.util.HashMap;

//An example of dynamic programming
//Dynamic programming is dividing a problem in smaller processing units and 
//handling the overlapping problem once.
//In the example below the fibonacci value calculation for a given input value is cached so that
//it is not calculated everytime. This is an example of overlapping problem that is solved only
//once and is cached rather than being calculated everytime.

public class Fibonacci {
	
	private static HashMap<Integer, Long> fiboCache = new HashMap<Integer, Long>();
	
	public static long fibo(int value){
		if(value == 0){
			return 1;
		}
		
		if(value == 1){
			return 1;
		}
		
		long fibVal = -1; 
				
		if(fiboCache.containsKey(value)){
			fibVal = fiboCache.get(value);
		}else{
			fibVal = fibo(value - 1) + fibo(value - 2);
		}
		fiboCache.put(value, fibVal);
		return fibVal;
	}
	
	//1 1 2 3 5 8 13 21 34
	public static void main(String[] args){
		System.out.println(fibo(80));
	}

}
