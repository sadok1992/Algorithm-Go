package deleteColumnsToMakeSorted;

public class SolutionDeleteAccountToMakeSorted {

	/*
	 * Running Time is O(NM) Where N size of the ARRAY and M size of the String
	 */
	public static int minDeletionSize(String[] A) {
        int sizeString = A[0].length();
        int count = 0;
        for(int j=0;j<sizeString;j++){
            for(int i=0;i<A.length-1;i++) {
                if(A[i].charAt(j)>A[i+1].charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		String[] input = {"zyx","wvu","tsr"};
		System.out.println(minDeletionSize(input));

	}

}
