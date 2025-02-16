package demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatewithoutHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 1, 4, 2, 1, 5 };
		
		
		
		int n[]= new int[a.length];
		int j=0;
		Arrays.sort(a);
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				n[j] = a[i];
				j++;
			}
		}
		n[j++] = a[a.length-1];
		for(int k=0;k<j;k++) {
			//a[k] = n[k];
			System.out.println(n[k]);
		}
//		System.out.println(a);
//		System.out.println(j);
	}

}
