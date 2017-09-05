package w1a7_TwinAssassin;

import java.util.Scanner;

public class TwinAssassin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userWord = scanner.nextLine();
		scanner.close();
		twinAssassin(userWord);
	}

	private static void twinAssassin(String userWord) {
		char[] word = userWord.toCharArray();
		String newWord = "";
		boolean letter = true;
		char test = 0;
		for (int i = 0; i < userWord.length(); i++) {
			for (int j = i+1; j < userWord.length(); j++) {
				test = word[j];
				if ((word[i] == test)) {
					  letter = false;
					}
				}
				if (letter != false) {
					newWord = newWord + word[i];
				}
				letter = true;
		}
		System.out.print(newWord);
	}
}
