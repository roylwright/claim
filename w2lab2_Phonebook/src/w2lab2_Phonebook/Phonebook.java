package w2lab2_Phonebook;

import java.util.ArrayList;

public class Phonebook {
	static ArrayList<Person> listing = new ArrayList();
	String entry;

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

}
