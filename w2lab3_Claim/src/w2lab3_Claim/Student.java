package w2lab3_Claim;

public class Student extends Person {

	public double taxes(double amount) {
		// TODO Auto-generated method stub
		return amount * 0.02;
	}
	public String toString() {
		String display = firstName + " " + lastName;
		return display;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
		
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
		
	}

}
