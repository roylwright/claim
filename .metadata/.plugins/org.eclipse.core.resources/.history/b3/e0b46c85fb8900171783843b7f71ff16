package w1a4_VowelMovements;

import java.util.Scanner;

public class VowelMovements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userWord = scanner.next();
		scanner.close();
		vowelMovements(userWord);
	}

	private static void vowelMovements(String userWord) {
		String newWord = "";
		for (int i = 0; i < userWord.length(); i++) {
			if (i != ((userWord.length()+1)/2)) {
				newWord = newWord + userWord.charAt(i);  //(userWord.length()-i);
			}	
		}
		System.out.println(newWord);
	}

}
