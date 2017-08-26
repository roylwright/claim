package w1a3_AlphaNumeric;

import java.util.Scanner;

public class AlphaNumeric {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String userWord = scanner.next();
		scanner.close();
		alphaNumeric(userWord);

	}

	private static void alphaNumeric(String userWord) {
		int number = userWord.charAt(0);
		System.out.print("Your number value is: "+ number);
		
	}

}
