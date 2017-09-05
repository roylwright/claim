package w1a7_YourCountVotes;

import java.util.Scanner;

public class YourCountVotes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userWord = scanner.next();
		scanner.close();
		char[] word = userWord.toCharArray();
		int x = yourCountVotes(word);
		System.out.print("Your word " + userWord + " has " + 
				x + " vowels and " + (word.length-x) + " constanents");

	}

	private static int yourCountVotes(char[] word) {
		int count = 0;
		for (int i = 0; i < word.length; i++){
			if(word[i]=='a') {
				count++;
			}else if(word[i]=='e') {
				count++;
			} else if(word[i]=='i') {
				count++;
			} else if(word[i]=='o') {
				count++;
			} else if(word[i]=='u') {
				count++;
			}
		}
		return count;
	}

}
