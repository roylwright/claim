package w2lab2_Phonebook;

import java.util.Scanner;

public class Listing {
	
	public static void main(String[] args) {
		int userInt;

		do {
		    System.out.println("View listing, enter 1: ");
		    System.out.println("Add entry, enter 2: ");
		    System.out.println("Delete entry, enter 3: ");
		    System.out.println("Search by Name, enter 4: ");
		    System.out.println("Search by number, enter 5: ");
		    System.out.println("Update existing entry, enter 6: ");
		    System.out.println("Exit program, enter 7: ");
		    Scanner scanner = new Scanner(System.in);

			System.out.print("Enter your choice: ");
			userInt = scanner.nextInt();
			//scanner.close();
			System.out.print(userInt);

				switch(userInt){
		     	case 1:viewAll();break;
		     	case 2:addToPhoneBook();break;
		     	case 3:deleteFromPhonebook();break;
		     	case 4:searchByName();break;
		     	case 5:searchByNumber();break;
		     	case 6:updateEntry();break;
				case 7:System.exit(0);break;
		     	default: System.out.println("\n\n\nInvalid choice");
				} 
			} while (userInt != 7);
//		public String getInput() {
//			Scanner scanner = new Scanner(System.in);
//			System.out.print("Enter a string: ");
//			String userInput = scanner.next();
//			scanner.close();
//			return userInput;
//		}

	}
	public static void viewAll() {
		System.out.println("This is where a list should be...");
	}
	public static void addToPhoneBook() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userWord = scanner.next();
		scanner.close();
		Person person = new Person(userWord);
		Phonebook.listing.add(person);
		System.out.println("This is where an add should be...");
	}
	public static void deleteFromPhonebook() {
		System.out.println("This is where a delete should be...");
	}
	public static void searchByName() {
		System.out.println("This is where a search name should be...");
	}
	public static void searchByNumber() {
		System.out.println("This is where a search number should be...");
	}
	public static void updateEntry() {
		System.out.println("This is where update entry should be...");
	}
}
