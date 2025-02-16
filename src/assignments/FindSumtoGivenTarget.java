package assignments;

import java.util.Arrays;
import java.util.HashMap;

public class FindSumtoGivenTarget {

	
	
	public static int[] findSumtogiventarget(int num[], int t) {
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		int extra =0;
		for(int i=0;i<num.length;i++) {
			extra = t-num[i];
			if(hmap.containsKey(extra)) {
				return new int[] {hmap.get(extra), i};
			}
			hmap.put(num[i], i);
		}
		return null;
		
		
		
	}
	public static void main(String[] args) {
		int nums[] = {14, 61, 29, 47, 12, 19, 30, 71};
		int target = 49;
		
		int n[] = findSumtogiventarget(nums, target);
		System.out.println(Arrays.toString(n));
//		for(int i=0;i<nums.length;i++) {
//			for(int j=i+1;j<nums.length;j++) {
//				if(nums[i]+nums[j] == target) {
//					System.out.println("Pair: " + (i+1) +" "+ (j+1));
//					break;
//				}
//				
//			}
//		}

	}

}
