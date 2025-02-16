package demos;

public class ReverseString {

	public static void main(String[] args) {
	String input = "NamanKumar";
	String output = "";
	
	int n = input.length();
	
	for(int i=n-1;i>=0;i--) {
		output = output+input.charAt(i);
	}
	System.out.println("Reverse String:" + output);

	}

}
