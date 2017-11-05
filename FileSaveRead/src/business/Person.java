package business;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Person {
	private String email = "fred@mail.com";
	private Account checking = new Account();
	private Account savings = new Account();
	public String[] a = {"1","2","3","4"};
		
	public static void main(String[] args) {
		Person p = new Person();
		writeFile(p.getEmail(), "main", p.a);
		writeFile(p.getEmail(), "checking", p.a);
		writeFile(p.getEmail(), "saving", p.a);
		System.out.println("main files created");
		//main files made, now to make some transactions
		
		
		
		readFile(p.getEmail(), "main");
		readFile(p.getEmail(), "checking");
		readFile(p.getEmail(), "saving");
		
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Account getChecking() {
		return checking;
	}

	public void setChecking(Account checking) {
		this.checking = checking;
	}

	public Account getSavings() {
		return savings;
	}

	public void setSavings(Account savings) {
		this.savings = savings;
	}
	public static void writeFile(String email, String type, String[] a) {
		String[] emails = email.split("\\.");		
		String path = "/Users/Roy/Desktop/TestPrintFiles/"+emails[0]+ type + ".txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (int i = 0; i < a.length; i++) {
			bw.write(a[i]);
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Error writing to file");
		}
	}
	public static void readFile(String email, String type) {
		String[] emails = email.split("\\.");		
		String path = "/Users/Roy/Desktop/TestPrintFiles/"+emails[0]+ type + ".txt";
		File file = new File(path);
		try(Scanner scanner = new Scanner(file)){
			String line = scanner.nextLine();
			String[] parseArray = line.split(",");
			for (int i = 0; i < parseArray.length; i++) {
			System.out.print(parseArray[i]+" ");
			
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	
}
