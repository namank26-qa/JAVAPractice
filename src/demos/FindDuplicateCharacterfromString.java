package demos;

import java.util.LinkedHashSet;

public class FindDuplicateCharacterfromString {

	public static void main(String[] args) {
		String input = "Naman".toLowerCase();
		char inputchar[] = input.toCharArray();
		
		//LinkedHashSet<Character> duplicate = new LinkedHashSet<>();
		
		boolean isnotDuplicate = false;
		
		for(int i=0;i<input.length();i++) {
			boolean isDuplicate = false;
			
			for(int j=i+1;j<input.length();j++) {
				if(inputchar[i]==inputchar[j]) {
					isDuplicate = true;
					//duplicate.add(inputchar[j]);
					break;
				}
			}
			if(isDuplicate) {
				System.out.println(inputchar[i]);
				//System.out.println(duplicate);
				isnotDuplicate = true;
			}			
		}
		//System.out.println(duplicate);
		if(!isnotDuplicate) {
			System.out.println("No Duplicates");
		}
		
		

	}

}
