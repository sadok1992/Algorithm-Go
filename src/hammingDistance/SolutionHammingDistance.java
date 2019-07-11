package hammingDistance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionHammingDistance {
	
	/*
	 * Running Time of this solution is O(n) where n is the range of integers in our case n is 31. 
	 */
	public static int hammingDistance(int x, int y) {
		List<Integer> binaryRange = Arrays.asList(1073741824,536870912,268435456,134217728,67108864,33554432,16777216,8388608,4194304,2097152,1048576,524288,262144,131072,65536,32768,16384,8192,4096,2048,1024,512,256,128,64,32,16,8,4,2,1);
		int hD = 0;
		for(int i=0;i<binaryRange.size();i++) {
			if(x>=binaryRange.get(i) && y>=binaryRange.get(i)) {
				x-=binaryRange.get(i);
				y-=binaryRange.get(i);
			}else if(x>=binaryRange.get(i)) {
				hD++;
				x-=binaryRange.get(i);
			}else if(y>=binaryRange.get(i)) {
				hD++;
				y-=binaryRange.get(i);
			}
		}
        return hD;
    }

	public static void main(String[] args) {
		System.out.println(hammingDistance(1,4));
	}

}
