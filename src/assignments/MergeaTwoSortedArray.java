package assignments;

public class MergeaTwoSortedArray {

	public static void main(String[] args) {
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,5,6};
		int n = (nums1.length)-1;
		int m = (nums2.length)-1;
		int t = (n+m)-1;
		//int nums3[] = new int[t];
		
		
		while(m>=0) {
			if(n>=0 && nums1[n]>nums2[m]) {
			nums1[t] = nums1[n];
			n--;
			}
			else {
				nums1[t] = nums2[m];
				m--;
			}
			t--;
		}
		
		for(int i: nums1 ) {
			System.out.println(i);
		}
		/*
		while (i<n && j<m) {
			if(nums1[i]<nums2[j]) {
				nums3[k++] = nums1[i++];
			}
			else
				nums3[k++] = nums2[j++];
		}
		while(i<n) {
			nums3[k++] = nums1[i++];
		}
		while(j<m) {
			nums3[k++] = nums2[j++];
		}
		for(int p: nums3) {
			System.out.println(p);
		}
		*/
	}
	
	
	
	
	/*
	 * int midx = m - 1; //
        int nidx = n - 1;
        int right = m + n - 1;

        while (nidx >= 0) {
            if (midx >= 0 && nums1[midx] > nums2[nidx]) {
                nums1[right] = nums1[midx];
                midx--;
            } else {
                nums1[right] = nums2[nidx];
                nidx--;
            }
            right--;
        }        
    }
        
    }
	 * */
	 

}
