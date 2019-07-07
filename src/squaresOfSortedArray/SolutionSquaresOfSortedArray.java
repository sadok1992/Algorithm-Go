package squaresOfSortedArray;

import helperFunctions.GenericAssister;

public class SolutionSquaresOfSortedArray {

	/*
	 * Running Time of this solution is O(n) 
	 */
	public static int[] sortedSquares(int[] A) {
		int [] result = new int[A.length];
		int i = 0;
		int j = A.length-1;
		int leftSquare = A[i] * A[i];
		int rightSquare = A[j] * A[j];
		for(int k=A.length-1;k>0;k--) {
			if(leftSquare<=rightSquare) {
				result[k]=rightSquare;
				j--;
				rightSquare = A[j] * A[j];
			}else {
				result[k]=leftSquare;
				i++;
				leftSquare = A[i] * A[i];
			}
		}
		if(leftSquare<=rightSquare) {
			result[0]=rightSquare;
		}else {
			result[0]=leftSquare;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] A = new int[] {-4,-1};
		GenericAssister.printArray(sortedSquares(A));
	}

}
