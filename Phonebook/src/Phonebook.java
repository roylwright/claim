import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phonebook {
	static List<Person> directory = new ArrayList<Person>();
	
	public static void main(String[] args) {
		String user = null;
		testLoad(); //this line enters test data into array
		
		do {
			printMenu(); //prints menu options
			String userInput = getInput(); //gets input and directs method to run
			switch(userInput) {
		    case "1":
		    	createDirectory();
		        break;
		    case "2":
		    	searchByFirstName();
		    	break;
		    case "3":
		    	searchByLastName();
		    	break;
		    case "4":
		    	searchByNumber();
		    	break;
		    case "5":
		    	searchBycity();
		    	break;	
		    case "6":
		    	searchByState();
		    	break;	
		    case "7":
		    	deleteByNumber();
		    	break;
		    case "8":
		    	deleteByNumber();
		    	createDirectory();
		    	break;
		    case "0":
		    	System.exit(0);
			}
		} while (user != "x");
	
		
		System.out.println(directory.toString());
	}


	private static void searchByState() {
		System.out.println("Enter two digit state code to search for: ");
		String userWord = getInput();
		String compare;
		
		for (int i=0; i<directory.size();i++) {
			compare = directory.get(i).getAddress().getState();
			//System.out.println(compare);
			if (compare.equals(userWord)) {
				System.out.println(directory.get(i));
			} 
		}
		
	}


	private static void searchBycity() {
		System.out.println("Enter city to search for: ");
		String userWord = getInput();
		String compare;
		
		for (int i=0; i<directory.size();i++) {
			compare = directory.get(i).getAddress().getCity();
			//System.out.println(compare);
			if (compare.equals(userWord)) {
				System.out.println(directory.get(i));
			} 
		}
		
	}


	private static void searchByNumber() {
		System.out.println("Enter phone number to search for: ");
		String userWord = getInput();
		String compare;
		
		for (int i=0; i<directory.size();i++) {
			compare = directory.get(i).getTelephone();
			//System.out.println(compare);
			if (compare.equals(userWord)) {
				System.out.println(directory.get(i));
			} 
		}
	}
	private static void searchByFirstName() {
		System.out.println("Enter first name to search for: ");
		String userWord = getInput();
		userWord = userWord + " ";
		String compare;
		
		for (int i=0; i<directory.size();i++) {
			compare = directory.get(i).getName().substring(0,userWord.length());
			//System.out.println(compare);
			if (compare.equals(userWord)) {
				System.out.println(directory.get(i));
			} 
		}
	}

	private static void searchByLastName() {
		System.out.println("Enter last name to search for: ");
		String userWord = getInput();
		String compare;
		for (int i=0; i<directory.size();i++) {
			compare = directory.get(i).getName().substring((directory.get(i).getName().length()-userWord.length()));
			System.out.println(compare);
			if (compare.equals(userWord)) {
				System.out.println(directory.get(i));
			} 
		}
	}

	public static void createDirectory() {
		System.out.print("Enter full name: ");
		String name = getInput();
		System.out.print("Enter telephone number: ");
		String telephone = getInput();
		Person p1 = new Person(name, telephone);
		System.out.print("Enter street address: ");
		String street = getInput();
		System.out.print("Enter city: ");
		String city = getInput();
		System.out.print("Enter two letter state code: ");
		String state = getInput();
		System.out.print("Enter 5 digit zip code: ");
		String zip = getInput();
		Address a1 = new Address(street, city, state, zip);
		p1.setAddress(a1);
		directory.add(p1);
		
		//System.out.println("Size of directory after adds: " + directory.size()); 
		//System.out.println(directory.toString());				
	}
	private static void deleteByNumber() {
		System.out.println("Enter phone number to search for: ");
		String userWord = getInput();
		String compare;
		
		for (int i=0; i<directory.size();i++) {
			compare = directory.get(i).getTelephone();
			//System.out.println(compare);
			if (compare.equals(userWord)) {
				System.out.println(directory.get(i));
				directory.remove(i);
			} 
		}
	}
	public static String getInput() {
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		//scanner.close();
		return userInput;
	}
	private static void printMenu() {
		System.out.println("Enter character for your choice:");
		System.out.println("1 for new entry:");
		System.out.println("2 for search by first name:");
		System.out.println("3 for search by last name:");
		System.out.println("4 for search by phone number :");
		System.out.println("5 for search by city:");
		System.out.println("6 for search by state:");
		System.out.println("7 for delete by phone number:");
		System.out.println("8 for update by phone number:");
		System.out.println("0 for exit program:");
		//System.out.println(" for :"); //for later
		
	}
	private static void testLoad() {
		Person p1 = new Person();
		Address a1 = new Address("114 Market St", "St Louis", "MO", "63403");
		p1.setName("John Doe");
		p1.setTelephone("6366435698");
		p1.setAddress(a1);
		directory.add(p1);
		
		Person p2 = new Person();
		Address a2 = new Address("324 Main St", "St Charles", "MO","63303");
		p2.setName("John E Doe");
		p2.setAddress(a2);
		p2.setTelephone("8475390126");
		directory.add(p2);
		
		
		Person p3 = new Person();
		Address a3 = new Address("574 Pole ave", "St Peters", "MO", "63333");
		p3.setName("John Michael West Doe");
		p3.setAddress(a3);
		p3.setTelephone("5628592375");
		//p3.setTelephone("1234567890");
		directory.add(p3);
		
		System.out.println("Size of directory after adds: " + directory.size()); 
		System.out.println(directory.toString());
	}
}
