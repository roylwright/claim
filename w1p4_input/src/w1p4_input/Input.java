package w1p4_input;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		inputInt();
		inputString();
	}
	public static void inputInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int userInt = scanner.nextInt();
		//scanner.close();
		System.out.println(userInt);
		
	}
	public static void inputString() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userWord = scanner.next();
		scanner.close();
		System.out.print(userWord);
	}

}
