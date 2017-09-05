package w2a1_HighBall;

import java.util.Scanner;

public class HighBall {

	public static void main(String[] args) {
		highBall();

	}

	private static void highBall() {
		int count = 100;
		int highCount = 0;
		int[] hundred = new int[count];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < count; i++) {
			System.out.print("Enter an integer: ");
			hundred[i] = scanner.nextInt();
			//scanner.close();
		}
		scanner.close();
		for (int i = 0; i < count; i++) {
			if (hundred[i]>highCount) {
				highCount = hundred[i];
			}
		}
		System.out.print("Your highest number is: " + highCount);
		
	}

}
