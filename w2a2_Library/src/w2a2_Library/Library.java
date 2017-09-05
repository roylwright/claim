package w2a2_Library;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		int userInt;
		
		fillLibrary();
		Customer customer = new Customer();
		Book book = new Book();
		customer.getBooks().add(book);

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
		     	//case 1:viewAllBooks();break;
//		     	case 2:getBook();break;
//		     	case 3:returnBook();break;
//		     	case 4:searchByName();break;
//		     	case 5:searchByNumber;break;
//		     	case 6:updateEntry();break;
				case 7:System.exit(0);break;
		     	default: System.out.println("\n\n\nInvalid choice");
				} 
			} while (userInt != 7);
		
		//System.out.println(book1);
		//System.out.println(book2);
		//getBranch();
	
	}

	private static void fillLibrary() {
		Book book1 = new Book("\nRR Martin", 34, "Floor of Thorns", 5);
		Book book2 = new Book("\nEmily Insulin", 33, "Ode to Blood Sugar", 15);
		
	}
}
