import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Taking noOfRows value from the user
		System.out.println("Input:");
		int noOfRows = sc.nextInt();
		//Initializing rowCount with 1
		int rowCount = 1;
		
		//Implementing the logic
		for (int i = 0; i <=noOfRows; i++) {
			//Printing i*2 spaces at the beginning of each row
			for (int j = 0; j <=noOfRows-i; j++) {
				System.out.print("  ");
			}
			//Printing j where j value will be from i to noOfRows
			for (int j = i; j >=0; j--) {
				System.out.print(j+" ");
			}
			//Printing j where j value will be from noOfRows-1 to i
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			//Incrementing the rowCount
			rowCount++;
		}
	}
}
