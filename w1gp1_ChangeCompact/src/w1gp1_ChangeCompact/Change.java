package w1gp1_ChangeCompact;
import java.util.Scanner;
public class Change {	
	private static int userInput;
	public static void main(String[] args) {
		//scanner obj enters integer value for conversion to change values
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a value between 0 and 100: ");
		userInput = scanner.nextInt();
		scanner.close();
		//calls method for number of coin required, returns undetermined change
		userInput = change("Quarters: ", 25, userInput);
		userInput = change("Dimes: ", 10, userInput);
		userInput = change("Nickels: ", 5, userInput);
		userInput = change("Pennies: ", 1, userInput);
	}
	public static int change(String word, int value, int userInput) {
		// method computes number of required coin and prints it to screen
		if (userInput/value != 0) {
		// if statement used to filter out blank results.
		System.out.println(word + "" + (userInput/value));
		}
		return (userInput % value); 
		//remaining value returned for use in next calculation
	}
}
