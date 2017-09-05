package w2p2_Phonebook;

import java.util.ArrayList;

public class Phonebook {

	public static void main(String[] args) {
	ArrayList directory = new ArrayList(); 
	
	
	// add elements to the array list 
	String input= "John Doe, 114 Market St, St Louis, MO, 63403, 6366435698";
	Person p1 = new Person(input);
	directory.add(p1);
	System.out.println("Initial size of al: " + directory.size());
	input= "John E Doe, 324 Main St, St Charles, MO,63303, 8475390126";
	Person p2 = new Person(input);
	directory.add(p2);
	System.out.println("Initial size of al: " + directory.size());
	input= "John Michael West Doe,574 Pole ave,St. Peters,MO,63333,5628592375";
	Person p3 = new Person(input);
	directory.add(p3);
	System.out.println("Initial size of al: " + directory.size());


	System.out.println("Initial size of al: " + directory.size());
	
	directory.add("A"); 
	directory.add("E"); 
	directory.add("B"); 
	directory.add("D"); 
	directory.add("F"); 
	directory.add(1, "A2"); 
	System.out.println("Size of directory after additions: " + directory.size()); 
	// display the array list 
	System.out.println("Contents of directory: " + directory); 
	// Remove elements from the array list 
	directory.remove("F"); 
	directory.remove(4); 
	System.out.println("Size of directory after deletions: " + directory.size()); 
	System.out.println("Contents of directory: " + directory);
	

//	private static void makeEntry() {
//		String userInput = "bob";
//		Person p4 = new Person(userInput);
//		directory.add(p4);
//		
//	}
	
	}

 
}