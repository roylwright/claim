package w1a6_VowelCount;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userWord = scanner.next();
		scanner.close();
		char[] word = userWord.toCharArray();
		int x = vowelCount(word);
		System.out.print("You word " + userWord + " has " + x + " vowels.");
	}
	private static int vowelCount(char[] word) {
		int count = 0;
		for (int i = 0; i < word.length; i++){
			if(word[i]=='a') {
				count++;
			}
			if(word[i]=='e') {
				count++;
			}
			if(word[i]=='i') {
				count++;
			}
			if(word[i]=='o') {
				count++;
			}
			if(word[i]=='u') {
				count++;
			}
		}
		return count;
	}

}
