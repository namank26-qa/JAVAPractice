package demos;

public class ConcatenateAlternativeCharfromTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "1234";
		
		System.out.println("Alternate Concate:" + alternateConcate(s1,s2));

	}

	private static String alternateConcate(String s1, String s2) {
		// TODO Auto-generated method stub
		
		StringBuilder result = new StringBuilder();
		for(int i=0; i<s1.length() || i< s2.length();i++) {
			if(i<s1.length()) {
				result.append(s1.charAt(i));
			}
			if(i<s2.length()) {
				result.append(s2.charAt(i));
			}
		}
		
		return result.toString();
	}

}
