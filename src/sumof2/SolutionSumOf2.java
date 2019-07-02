package sumof2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class SolutionSumOf2 {
	
	/*
	 * Running Time of this solution is O(n^2)
	 * Space Complexity is O(1)
	 */
	public static int[] twoSum1(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if (nums[i] + nums[j] == target){
                   return new int[] { i, j };
                }
            }
        }
        return new int[]{};
    }
	
	/*
	 * Running Time of this solution is O(n)
	 * Space Complexity is O(n)
	 */
	public static int[] twoSum2(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i],i);
		}
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i) {
				return new int[] {i,map.get(target-nums[i])};
			}
		}
		return new int[]{};
    }

	public static void main(String[] args) {
		
		int[] nums = new int[] {2,7,11,15,9};
		int target = 9;
		showResult(twoSum2(nums,target));

	}
	
	public static void showResult(int nums[]) {
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

}
