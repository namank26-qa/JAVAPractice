package patternPrintingProblems;

public class TriangleStarPattern {

	public static void main(String[] args) {
		//start the loop for columns
		for(int i=1;i<=4;i++) {
			//start the loop for printing rows in a way where elements in row and column are same corresponding their index
			//like column 1: 1 element
			//column 2: 2 elements so on
			for(int j=1;j<=i;j++) {
				//print element in the same line
				System.out.print("*");
			}
			//move to next line or column
			System.out.println("");
		}
		

	}

}
