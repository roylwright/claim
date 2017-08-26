package w1p4_input;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		inputInt();
		inputString();
	}
	public static void inputInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a value between 0 and 100: ");
		int userInt = scanner.nextInt();
		System.out.println(userInt);
		//scanner.close();
	}
	public static void inputString() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userWord = scanner.next();
		System.out.print(userWord);
		scanner.close();
	}

}
