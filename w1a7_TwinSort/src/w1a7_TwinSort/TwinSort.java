package w1a7_TwinSort;

import java.util.Scanner;

public class TwinSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userWord = scanner.nextLine();
		scanner.close();
		twinSort(userWord);

	}

	private static void twinSort(String userWord) {
		char[] word = userWord.toCharArray();
		String newWord = "";
		String newWord2 = "";
		boolean match = false;
		char test = 0;
		for (int i = 0; i < userWord.length(); i++) {
			for (int j = 0; j < userWord.length(); j++) {
				test = word[j];
				if ((word[i] == test)&&(i != j)) {
					  match = true;
					}
				}
			if (match == true) {
				newWord2 = newWord2 + word[i];
				match = false;
			} else {
				newWord = newWord + word[i];
			}
				
		}
		System.out.print(newWord+newWord2);
		
	}

}
