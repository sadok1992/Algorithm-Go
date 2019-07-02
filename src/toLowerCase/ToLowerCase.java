package toLowerCase;

import java.util.HashMap;
import java.util.Map;

public class ToLowerCase {

	public static String toLowerCase1(String str) {
	        return str.toLowerCase();   
	}
	
	/*
	 * Running Time of this solution is O(n) where n is the size of the String
	 * Space Complexity is O(1)
	 */
	public static String toLowerCase2(String str) {
		Map<Character,Character> map = new HashMap<>();
		map.put('A', 'a');
		map.put('B', 'b');
		map.put('C', 'c');
		map.put('D', 'd');
		map.put('E', 'e');
		map.put('F', 'f');
		map.put('G', 'g');
		map.put('H', 'h');
		map.put('I', 'i');
		map.put('J', 'j');
		map.put('K', 'k');
		map.put('L', 'l');
		map.put('M', 'm');
		map.put('N', 'n');
		map.put('O', 'o');
		map.put('P', 'p');
		map.put('Q', 'q');
		map.put('R', 'r');
		map.put('S', 's');
		map.put('T', 't');
		map.put('U', 'u');
		map.put('V', 'v');
		map.put('W', 'w');
		map.put('X', 'x');
		map.put('Y', 'y');
		map.put('Z', 'z');
		
		StringBuilder result = new StringBuilder();
		for(int i=0; i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				result.append(map.get(str.charAt(i)));
			} else {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
		 
	}
	 
	public static void main(String[] args) {
		String input = "Hello";
		System.out.println(toLowerCase2(input));

	}
	
	

}
