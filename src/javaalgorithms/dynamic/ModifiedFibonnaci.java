package javaalgorithms.dynamic;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * We define a modified Fibonacci sequence using the following definition:

Given terms  and  where , term  is computed using the following relation:
For example, if term  and , term , term , term , and so on.

Given three integers, , , and , compute and print term  of a modified Fibonacci sequence.

Note: The value of  may exceed the range of a -bit integer. Many submission languages have libraries that can handle such large results but, for those that don't (e.g., C++), you will need to be more creative in your solution to compensate for the limitations of your chosen submission language.

Input Format

A single line of three space-separated integers describing the respective values of , , and .

Constraints

 may exceed the range of a -bit integer.
Output Format

Print a single integer denoting the value of term  in the modified Fibonacci sequence where the first two terms are  and .

Sample Input

0 1 5
Sample Output

5
Explanation

The first two terms of the sequence are  and , which gives us a modified Fibonacci sequence of . Because , we print term , which is .
 */

public class ModifiedFibonnaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger firstNumber = BigInteger.valueOf(sc.nextInt());
		BigInteger secondNumber = BigInteger.valueOf(sc.nextInt());
		
		int n = sc.nextInt();
		
		BigInteger[] cache = new BigInteger[n];
		for(int i=0;i<n;i++){
			cache[i] = BigInteger.ZERO;
		}
		
		BigInteger fib = fibo(n-1,firstNumber, secondNumber, cache);
		
		
		System.out.println(fib);

	}
	
	public static BigInteger fibo(int n,BigInteger firstNumber, BigInteger secondNumber, BigInteger[] cache){
		if( n == 1){
			cache[n] = secondNumber;
			return secondNumber;
		}
		
		if(n == 0){
			cache[n] = firstNumber;
			return firstNumber;
		}
		
		if(cache[n] != BigInteger.ZERO){
			return cache[n];
		}
		
		BigInteger value = fibo(n-2,firstNumber, secondNumber, cache).add(fibo(n - 1,firstNumber, secondNumber, cache).multiply(fibo(n-1,firstNumber, secondNumber, cache)));
		cache[n] =  value;
		return value;
	}

}
