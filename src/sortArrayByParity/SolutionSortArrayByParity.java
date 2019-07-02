package sortArrayByParity;

import helperFunctions.GenericAssister;

public class SolutionSortArrayByParity {
	
	/*
	 * Running Time of this solution is O(n) 
	 */
	public static int[] sortArrayByParity(int[] A) {
		int[] result = new int[A.length];
		int j=0,k=A.length-1;
		for(int i=0;i<A.length;i++) {
			if(A[i]%2 == 0) {
				result[j++] = A[i];
			}else {
				result[k--] = A[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] A = new int[] {3,1,2,4};
		GenericAssister.printArray(sortArrayByParity(A));
	}

}
