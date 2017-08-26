package w1a4_Unique;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		unique();
		
	}
	private static void unique() {
		String unique = "is";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userWord = scanner.next();
		
		
		scanner.close();
		
		for (int i = 0; i <userWord.length()-1; i++) {
			char a = userWord.charAt(i);
			for(int j = i+1; j<userWord.length(); j++) {
				char b = userWord.charAt(j);
				if (a==b) {
					unique = "is not";
					//System.out.println(unique);
					break;
				}
			}
		}
		System.out.print(userWord + " " + unique + " a unique word.");
	}

}
