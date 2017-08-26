package w1a3_Triangle;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a triangle width: ");
		int userInt = scanner.nextInt();
		System.out.print("Enter a triangle base: ");
		int userInt2 = scanner.nextInt();
		scanner.close();
		triangle(userInt, userInt2);

	}

	private static void triangle(int userInt, int userInt2) {
		System.out.println("The area is: "+ userInt*userInt2/2);
		
	}

}
