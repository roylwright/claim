package w1a4_Backwards;

import java.util.Scanner;

public class Backwards {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userWord = scanner.next();
		scanner.close();
		backwards(userWord);

	}

	private static void backwards(String userWord) {
		String newWord = "";
		for (int i = 0; i < userWord.length(); i++) {
			newWord = newWord + userWord.charAt(userWord.length()-1-i);  //(userWord.length()-i);
		}
		System.out.println(newWord);
	}

}
