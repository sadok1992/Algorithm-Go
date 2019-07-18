package peakIndexInMountainArray;

public class SolutionPeakIndexInMountainArray {
	
	/*
	 * Running Time is O(log(N)) where N is the size of the array.
	 */
	public static int peakIndexInMountainArray(int[] A) {
        return binarySearch(A, 0, A.length-1);
    }
	
	public static int binarySearch(int[] A, int start,int end) {
		int m = (start + end)/2;
		if(A[m]>=A[m+1] && A[m]>=A[m-1]) {
			return m;
		}else if(A[m]>=A[m+1]) {
			return binarySearch(A,start,m-1);
		}else {
			return binarySearch(A,m+1,end);
		}
	}
	
	public static void main(String[] args) {
		int [] A = new int[] {0,2,1,0};
		System.out.println(peakIndexInMountainArray(A));
	}

}
