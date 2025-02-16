package assignments;

import java.util.HashMap;

public class HighestFrequencyElement {
	
	public static int findHighestFrequency(int input[]) {
		HashMap<Integer,Integer> hmap = new HashMap<>();
		int frequency = 0;
		int highest = 0;
		
		for(int c: input) {
			hmap.put(c, hmap.getOrDefault(c, 0)+1);
			if(hmap.get(c)>highest) {
				frequency = c;
				highest = hmap.get(c);
			}
		}
		
		return frequency;
	}
	
	public static char findHighestFrequency(String input) {
		char[] charArray = input.toCharArray();
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		char frequency = 0;
		int highest = 0;
		int l = input.length();
		
		
		for(int i=0;i<l;i++) {
			char ch = input.charAt(i);
			hmap.put(ch, hmap.getOrDefault(ch, 0)+1);
			if(hmap.get(ch)>highest) {
				frequency = ch;
				highest = hmap.get(ch);
			}
		}
//		for(char c: charArray) {
//			hmap.put(c, hmap.getOrDefault(c, 0)+1);
//			if(hmap.get(c)>highest) {
//				frequency = c;
//				highest = hmap.get(c);
//			}
//		}
		
		return frequency;
		
	}

	public static void main(String[] args) {
		int[] in = {1,2,3,4,4,4,5,6,77,8,1,3};
		
		String input = "aabbdccabbccdd";

//		int frequencyinIntegerArray = findHighestFrequency(in);
//		System.out.println(frequencyinIntegerArray);
		
		int frequencyinStringArray = findHighestFrequency(input);
		System.out.println(frequencyinStringArray);

	}

}
