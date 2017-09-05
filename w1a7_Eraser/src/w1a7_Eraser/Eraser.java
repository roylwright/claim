package w1a7_Eraser;

import java.util.Scanner;

public class Eraser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userWord = scanner.next();
		System.out.println("Enter a letter to erase: ");
		char userChar = scanner.next(".").charAt(0);
		scanner.close();
		
		erase(userChar, userWord);
	}

	private static void erase(char userChar, String userWord) {
		char[] letter = userWord.toCharArray();
		String newWord = "";
		for (int i = 0; i < userWord.length(); i++) {
			if (letter[i] != userChar) {
				newWord = newWord + letter[i];  //(userWord.length()-i);
			}
			
		}
		System.out.println(newWord);
		
	}

}
