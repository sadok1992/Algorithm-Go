package flipImage;

import helperFunctions.GenericAssister;

public class SolutionFlipImage {
	
	/*
	 * Running Time of this solution is O(n^2) 
	 */
	public static int[][] flipAndInvertImage(int[][] A) {
		int[][] result = new int[A.length][A.length];
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length;j++) {
				result[i][j] = A[i][A.length-j-1]-1;
				result[i][j] *= result[i][j];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[][] A = new int[][] {{1,1,0},{1,0,1},{0,0,0}};
		GenericAssister.printMatrix(flipAndInvertImage(A));
	}

}
