package w1a4_UpperLowerCase;

import java.util.Scanner;

public class UpperLowerCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userWord = scanner.next();
		scanner.close();
		upperLowerCase(userWord);

	}

	private static void upperLowerCase(String userWord) {
		String newWord = "";
		for (int i = 0; i < userWord.length(); i++) {
			if (i%2 == 1) {
			newWord = newWord + userWord.toUpperCase().charAt(i);  //(userWord.length()-i);
			} else {
				newWord = newWord + userWord.toLowerCase().charAt(i);
			}
			}
		System.out.println(newWord);
	}
}
