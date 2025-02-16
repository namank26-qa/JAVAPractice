package patternPrintingProblems;

public class MirroredRhombusStarPattern {

	public static void main(String[] args) {
		// start the loop to print columns
		for (int i = 4; i >= 1; i--) {

			//loop to print decrement the space with number column number
			//of spaces equal to column
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 4; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
