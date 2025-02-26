package demos;

public class RemoveDuplicatesfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aaaabbcccdddeebccd";
		
		System.out.println("After removal of duplicates from string: " + removeDuplicates(s));

	}

	private static String removeDuplicates(String s) {
		// TODO Auto-generated method stub
		
		StringBuilder r = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(r.indexOf(String.valueOf(s.charAt(i))) == -1) { //we will check if there any character already present, if not then append
				r.append(s.charAt(i));
			}
		}
		return r.toString();
	}

}
