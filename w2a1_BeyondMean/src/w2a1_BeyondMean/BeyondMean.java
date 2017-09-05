package w2a1_BeyondMean;

import java.util.Scanner;

public class BeyondMean {

	public static void main(String[] args) {
		beyondMean();

	}

	private static void beyondMean() {
		int count = 100;
		int highCount = 0;
		int total = 0;
		int[] hundred = new int[count];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < count; i++) {
			System.out.print("Enter an integer: ");
			hundred[i] = scanner.nextInt();
			//scanner.close();
		}
		scanner.close();
		for (int i = 0; i < count; i++) {
			total = total + hundred[i];
		}
		for (int i = 0; i < count; i++) {
			if (hundred[i]>(total/count)) {
			highCount++;
			}
		}
		System.out.print("Your average is: " + total/count + 
				" and the count of numbers above that is: " + highCount);
	}

}
