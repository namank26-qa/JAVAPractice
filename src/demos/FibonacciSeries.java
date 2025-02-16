package demos;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f = 9;
		int num[] = new int[f];
		num[0] = 0;
		num[1] = 1;
		
		for(int i=2; i<f;i++) {
			num[i] = num[i-1]+num[i-2];
		}
		
		for(int i=0;i<f;i++) {
			System.out.println(num[i]+"");
		}

	}

}
