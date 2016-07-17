package javaalgorithms;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Find first non repeating character in a string
 * 
 * @author manishpeshwani
 *
 */
public class LinkedHashMapExample {

	public static void main(String[] args) {
		Map<Character, Integer> countPerChar = new LinkedHashMap<Character, Integer>();
		
		String str = "HyderabadH";
		
		char[] chars = str.toCharArray();
		
		for(int i=0; i<chars.length; i++){
			char c = chars[i];
			
			if(countPerChar.containsKey(c)){
				countPerChar.put(c, countPerChar.get(c)+1);
			}else{
				countPerChar.put(c, 1);
			}
		}
		
		for(int i=0; i<chars.length; i++){
			if(countPerChar.get(chars[i]) == 1){
				System.out.println(chars[i]);
				break;
			}
		}

	}

}
