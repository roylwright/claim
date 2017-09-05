package w2a2_Library;

import java.util.ArrayList;

public class Customer {
	private String firstName;
	private String lastName;
	private String ident;
	private ArrayList<Book> books = new ArrayList<>();
	
	public Customer() {}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdent() {
		return ident;
	}
	public void setIdent(String ident) {
		this.ident = ident;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}


	
}
