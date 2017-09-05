import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phonebook {
	static List<Person> directory = new ArrayList<Person>();
	
	public static void main(String[] args) {
		
		testLoad();
		createDirectory();
		//searchByFirstName();
		searchByLastName();

	}
	
	private static void testLoad() {
		Person p1 = new Person();
		p1.name = "John Doe";
		p1.address = "114 Market St, St Louis, MO, 63403";
		p1.telephone = "6366435698";
		directory.add(p1);
		Person p2 = new Person();
		p2.name = "John E Doe";
		p2.address = "324 Main St, St Charles, MO,63303";
		p2.telephone = "8475390126";
		directory.add(p2);
		Person p3 = new Person();
		p3.name = "John Michael West Doe";
		p3.address = "574 Pole ave, St. Peters, MO, 63333";
		p3.telephone = "5628592375";
		directory.add(p3);
		
	}
	private static void searchByNumber() {
		System.out.println("Enter phone number to search for: ");
		String userWord = getInput();
		userWord = userWord;
		String compare;
		
		for (int i=0; i<directory.size();i++) {
			compare = directory.get(i).telephone;
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
			compare = directory.get(i).name.substring(0,userWord.length());
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
			compare = directory.get(i).name.substring((directory.get(i).name.length()-userWord.length()));
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
		directory.add(p1);
		System.out.println("Size of directory after adds: " + directory.size()); 
		System.out.println(directory.toString());				
	}
	public static String getInput() {
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		//scanner.close();
		return userInput;
	}

}
