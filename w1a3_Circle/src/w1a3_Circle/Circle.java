package w1a3_Circle;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a circle radius: ");
		int userInt = scanner.nextInt();
		scanner.close();
		circle(userInt);

	}

	private static void circle(int userInt) {
		System.out.println("Your circumfrence is " + (2*3.14159*userInt));
		System.out.println("Your area is " + (3.14159*Math.pow(userInt, 2)));
	}

}
