package demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Countnumberofcharacteroccurence {

	public static void main(String[] args) {
		String input = "NamanKumar".toLowerCase();
		// int[] in = {1,2,3,4,4,4,5,6,77,8,1,3};
		// int m=0,r=0;
		char[] inputchararray = input.toCharArray();

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		// HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		for (char c : inputchararray) {
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else
				hmap.put(c, 1);
		}
//			hmap.put(c, hmap.getOrDefault(c, 0)+1);
//			if(hmap.get(c)>m) {
//				r=c;
//				m=hmap.get(c);
//			}
//		}
		System.out.println(hmap);
	}
}
