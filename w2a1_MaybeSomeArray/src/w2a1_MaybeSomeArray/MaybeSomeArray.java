package w2a1_MaybeSomeArray;

import java.util.Scanner;

public class MaybeSomeArray {

	public static void main(String[] args) {
		maybeSomeArray();

	}

	private static void maybeSomeArray() {
		int count = 100;
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
		System.out.print("Your total is: " + total);
	}

}
