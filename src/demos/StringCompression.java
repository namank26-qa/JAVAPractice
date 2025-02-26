package demos;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabbcddddeee";
		System.out.println("String after compression:" + compressedString(s));

	}

	private static String compressedString(String s) {
		// TODO Auto-generated method stub
		
		StringBuilder r = new StringBuilder();
		 int c =1;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i) == s.charAt(i-1)) {
				//r.append(s.charAt(i));
				c++;
			}
			else
			{
				r.append(s.charAt(i-1)).append(c);
				c=1;
			}
		}
		return r.length()<s.length() ? r.toString():s;
	}

}
