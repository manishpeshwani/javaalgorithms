package javaalgorithms;

import java.util.Stack;

/**
 * Eample of a postfix calculator demonstrating Stack example
 * 
 * @author manishpeshwani
 *
 */
public class StackExample {

	public static void main(String[] args) {
		String eval = "5 6 7 * + 1 -";
		
		Stack<Integer> numbers = new Stack<Integer>();
		
		String[] vals = eval.split(" ");
		
		int result = 0;
		
		for(int i=0;i<vals.length;i++){
			if(isNumber(vals[i])){
				numbers.push(Integer.parseInt(vals[i]));
				System.out.println(numbers);
			}else {
				int right = numbers.pop();
				int left  = numbers.pop();
				
				if(vals[i].equals("*")){					
					result = (right*left);
				}else if(vals[i].equals("+")){
					result = (right + left);
				}else if(vals[i].equals("-")){
					result = (left - right);
				}
				numbers.push(result);
				System.out.println(numbers);
				System.out.println(result);
			}
		}
		
		System.out.println(result);
 
	}
	
	public static boolean isNumber(String str){
		
		try{
			Integer.parseInt(str);
			return true;
		}catch(NumberFormatException ne){
			return false;
		}
		
	}

}
