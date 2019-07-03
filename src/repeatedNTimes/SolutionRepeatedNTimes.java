package repeatedNTimes;

import java.util.HashMap;
import java.util.Map;

public class SolutionRepeatedNTimes {

	// size of the array is 2N always.
	public static int repeatedNTimes(int[] A) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int N = A.length / 2;
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
				if (map.get(A[i]) == N) {
					return A[i];
				}
			} else {
				map.put(A[i], 1);
			}
		}
		return -999;
	}
	
	/*
	 * Running Time of this solution is O(N) 
	 */
	// size of the array is 2N always and we know that there is N + 1 distinct number.
	public static int repeatedNTimes2(int[] A) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) {
					return A[i];
			} else {
				map.put(A[i], 1);
			}
		}
		return -999;
	}

	public static void main(String[] args) {
		int[] A = new int[] {1,2,3,3};
		System.out.println(repeatedNTimes2(A));

	}
}
