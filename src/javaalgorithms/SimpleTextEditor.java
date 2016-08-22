package javaalgorithms;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
	
	private static Stack<String> memory = new Stack<String>();
	private static String text = null;

	public static void main(String[] args) {
		SimpleTextEditor editor = new SimpleTextEditor();
		
		Scanner scanner = new Scanner(System.in);
		int noOfOperations = scanner.nextInt();
		
		for(int i=0; i<noOfOperations;i++){
			int operation = scanner.nextInt();
			if(operation == 1){
				String str = scanner.next();
				append(str);
			}else if(operation == 2){
				int k = scanner.nextInt();
				remove(k);
			}else if(operation == 3){
				int k = scanner.nextInt();
				print(k);
			}else {
				undo();
			}
		}

	}
	
	public static void append(String str){
		memory.push(text);
		if(text == null){
			text = "";
		}
		text = text.concat(str);
	}
	
	public static void remove(int k){
		memory.push(text);
		if(text != null){
			text = text.substring(0, text.length() - k);
		}
	}
	
	public static void print(int k){
		System.out.println(text.substring(k-1, k));
	}
	
	public static void undo(){
		text = memory.peek(); 
		memory.pop();
	}

}
