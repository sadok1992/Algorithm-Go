package selfDividingNumber;

import java.util.ArrayList;
import java.util.List;

public class SolutionSelfDividingNumber {
	
	
	/*
	 * Running Time of this solution is O(N*X) where N the total number from left to right and max number of digits. 
	 */
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<>();
        for(int x =left;x<=right;x++) {
        	if(x<10) {
        		result.add(x);
        	}else {
	        	int q = x / 10 ;
	        	int r = x % 10 ;
	        	boolean isDivisible = true;
	        	if(r == 0 || x % r != 0) {
	        		isDivisible = false;
	        	} else {
	        		while (isDivisible && q!=0) {
	        			r = q % 10 ;
	        			q = q / 10 ;
	        			if(r == 0 || x % r != 0) {
	        				isDivisible = false;
	        			} 
	        		}
	        	}
	        	if(isDivisible) {
	        		result.add(x);
	        	}
        	}
        }
        return result;
	}
	 
	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(1,22));

	}

}
