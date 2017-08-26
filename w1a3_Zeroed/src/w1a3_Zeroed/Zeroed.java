package w1a3_Zeroed;

import java.util.Scanner;

public class Zeroed {

	public static void main(String[] args) {
	
		zeroed();
	}

	private static void zeroed() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an interger: ");
		int userInt = scanner.nextInt();
		scanner.close();
		double result = userInt;
		System.out.println
		("Your number was "+userInt+" the new number is "+result);
	}

}
