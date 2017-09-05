package w2a2_Library;

public class Book {
	private String author;
	private int isbn;
	private String title;
	private int numberOfPages;
	
	
	public Book() {}
	public Book(String author , int isbn, String title, int numberOfPages) {
		this.author = author;
		this.isbn = isbn;
		this.title = title;
		this.numberOfPages = numberOfPages;
		
	}
	public void viewAllBooks() {
		
	}
	public String toString() {		
		String displayInfo= getAuthor()+"\nISBN: "+ getIsbn()+
				"\nTitle: "+ getTitle()+"\nNumber of pages: "
				+getNumberOfPages();
		return displayInfo;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
}
