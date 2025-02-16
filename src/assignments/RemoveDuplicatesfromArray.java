package assignments;

public class RemoveDuplicatesfromArray {
	
	public static int removeDuplicates(int nums[]) {
		int j=1;
		for(int i=1;i<nums.length;i++) {
			if(nums[i]!=nums[i-1]) {
				nums[j]=nums[i];
				j++;
			}
		}	
		return j;
	}

	public static void main(String[] args) {
		int n[] = {1,1,1,2,2,3};
		
		int val = removeDuplicates(n);
		System.out.println(val);
		
		

	}

}
