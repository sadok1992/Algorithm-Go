package dIString;

import helperFunctions.GenericAssister;

public class SolutionDIString {
	
	/*
	 * Running Complexity of this solutin is O(N) where N is the size of the String
	 */
	public static int[] diStringMatch(String S) {
		  int N = S.length();
	        int lo = 0, hi = N;
	        int[] ans = new int[N + 1];
	        for (int i = 0; i < N; ++i) {
	            if (S.charAt(i) == 'I')
	                ans[i] = lo++;
	            else
	                ans[i] = hi--;
	        }

	        ans[N] = lo;
	        return ans;
	}

	public static void main(String[] args) {
		String S = "III";
		GenericAssister.printArray(diStringMatch(S));

	}

}
