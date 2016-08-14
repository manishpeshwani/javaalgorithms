package javaalgorithms;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		String str = "{[]}";
		
		char[] chars = str.toCharArray();
		
		Stack<Character> brackets = new Stack<Character>();
		
		boolean balanced = true;
		
		for(int i=0;i<chars.length;i++){
			if(chars[i] == '(' || chars[i] == '{' || chars[i] == '['){
				brackets.push(chars[i]);
			}
			if(brackets.isEmpty()){
				balanced = false;
				break;
			}
			if(chars[i] == '}'){
				char c = brackets.pop();
				if(c != '{'){
					balanced = false;
					break;
				}
			}
			
			if(chars[i] == ']'){
				char c = brackets.pop();
				if(c != '['){
					balanced = false;
					break;
				}
			}
			
			if(chars[i] == ')'){
				char c = brackets.pop();
				if(c != '('){
					balanced = false;
					break;
				}
			}
		}
		
		if(!brackets.isEmpty()){
			balanced = false;
		}
		
		if(balanced){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
