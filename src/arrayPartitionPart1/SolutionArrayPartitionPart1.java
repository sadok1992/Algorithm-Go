package arrayPartitionPart1;

import helperFunctions.GenericAssister;

public class SolutionArrayPartitionPart1 {
	
	/*
	 * Running Time is O(N Log(N)) where N is the size of array.
	 */
	public static int arrayPairSum(int[] nums) {
		mergeSort(nums, 0, nums.length-1);
		int sum = 0;
		for(int i=0;i<nums.length-1;i=i+2) {
			if(nums[i]<nums[i+1]) {
				sum+=nums[i];
			}else {
				sum+=nums[i+1];
			}
		}
		
		return sum;
	}
	
	public static void mergeSort(int[] nums,int l, int r) {
		if(l<r) {
			int m = (l+r)/2;
			mergeSort(nums, l,m );
			mergeSort(nums, m+1, r);
			merge(nums, l, r, m);
		}
	}
	
	public static void merge(int[]A, int l, int r, int m) {
		int i=l;
		int j=m+1;
		int k=0;
		int [] temp = new int[r-l+1];
		while(i<m+1 && j<r+1) {
			if(A[i]<A[j]) {
				temp[k++] = A[i++];
			}else {
				temp[k++] = A[j++];
			}
		}
		if(i<m+1) {
			while(i<m+1) {
				temp[k++] = A[i++];
			}
		}else {
			while(j<r+1) {
				temp[k++] = A[j++];
			}
		}
		int s = l ;
		for(int x=0;x<temp.length;x++) {
			A[s++]=temp[x];
		}
	}

	public static void main(String[] args) {
		int[] A = new int[] {1,9,4,6};
		mergeSort(A, 0, A.length-1);
		GenericAssister.printArray(A);
		System.out.println(arrayPairSum(A));

	}

}
