package hightChecker;

public class HightCheckerSolution {
	
	
	/*
	 1 <= heights.length <= 100
	 1 <= heights[i] <= 100
	 */
	public static int heightChecker(int[] heights) {
		int[] bucket = new int[101];
		for(int i=0;i<heights.length;i++) {
			bucket[heights[i]]++;
		}
		int[] sortedElement = new int[heights.length];
		int k = 0;
		for(int i=0;i<bucket.length;i++) {
			if(bucket[i]>0) {
				for(int j=0;j<bucket[i];j++) {
					sortedElement[k++] = i;
				}
			}
		}
		int result = 0;
		for(int i=0;i<heights.length;i++) {
			if(heights[i]!=sortedElement[i]) {
				result++;
			}
		}
		return result;
    }

	public static void main(String[] args) {
		int[] list = new int[] {1,1,4,2,1,3};
		System.out.println(heightChecker(list));

	}

}
