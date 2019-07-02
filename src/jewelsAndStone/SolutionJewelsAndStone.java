package jewelsAndStone;

import java.util.HashMap;
import java.util.Map;

public class SolutionJewelsAndStone {

	/*
	 * Running Time of this solution is O(n^2) 
	 * Space Complexity is O(1)
	 */
	public static int numJewelsInStones1(String J, String S) {
		int result = 0;
	    for(int i=0;i<S.length();i++) {
	    	for(int j =0;j<J.length();j++) {
	    		if(J.charAt(j)==S.charAt(i)) {
	    			result++;
	    			break;
	    		}
	    	}
	    }  
	    return result;
	}
	
	/*
	 * Running Time of this solution is O(n) 
	 * Space Complexity is O(n)
	 */
	public static int numJewelsInStones2(String J, String S) {
		int result = 0;
		Map<Character,Integer> map = new HashMap<>();
		for(int j =0;j<J.length();j++) {
			map.put(J.charAt(j), j);
		}
	    for(int i=0;i<S.length();i++) {
	    	if(map.containsKey(S.charAt(i)))
	    		result++;
	    }  
	    return result;
	}

	public static void main(String[] args) {
		String J = "aA";
		String S = "aAAbbbb";
		System.out.println(numJewelsInStones2(J, S));

	}
	

}
