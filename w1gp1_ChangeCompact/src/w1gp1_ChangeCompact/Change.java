package w1gp1_ChangeCompact;
import java.util.Scanner;
public class Change {	
	private static int userInput;
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a value between 0 and 100: ");
		userInput = scanner.nextInt();
		scanner.close();		
		userInput = change("Quarters: ", 25, userInput);
		userInput = change("Dimes: ", 10, userInput);
		userInput = change("Nickels: ", 5, userInput);
		userInput = change("Pennies: ", 1, userInput);
	}
	public static int change(String word, int value, int userInput) {
		System.out.println(word + "" + (userInput/value));
		return (userInput % value);
	}
}
