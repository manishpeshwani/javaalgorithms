package javaalgorithms.stack;

import java.util.Scanner;
import java.util.Stack;

public class PrintMaxNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] commands = new int[n];
		
		for(int i=0; i<n; i++){
			commands[i] = scanner.nextInt();
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> maxStack = new Stack<Integer>();
		
		for(int i=0; i< n; i++){
			int command = commands[i];
			
			if(command == 0){
				if(!maxStack.isEmpty()){
					System.out.println(maxStack.peek());
				}
			}else if(command == -1){
				if(!stack.isEmpty()){
					int value = stack.pop();//Remove the element
					if(!maxStack.isEmpty() && value == maxStack.peek()){
						maxStack.pop();
					}
				}
			}else{
				stack.push(command);
				if(!maxStack.isEmpty() && command > maxStack.peek()){
					maxStack.push(command);
				}
				
				if(maxStack.isEmpty()){
					maxStack.push(command);
				}
			}
		}

	}

}
