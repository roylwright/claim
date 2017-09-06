
class Person {
	private String name = "Roy Wright";
	private String telephone = "3144131177"; 
	private Address address;

   @Override
   public String toString() {
	   String line1 = "\nName: "+ getName();
	   String line2 = "\n"+ getAddress();
	   String line3 = "\nPhone No: (" + getTelephone().substring(0, 3) +")"+
               getTelephone().substring(3,6)+"-"+getTelephone().substring(6);
        return (line1 + line2 + line3);
   }
   public Person() {}
   public Person(String userInput, String telephone) {
		this.name = userInput;
		this.telephone = telephone;
	}

   public String getName() {
		return name;
	}
   public void setName(String name) {
		this.name = name;
	}
   public String getTelephone() {
		return telephone;
	}
   public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
   public Address getAddress() {
	   	return address;
   	}
   public void setAddress(Address address) {
	   	this.address = address;
   	}
	
}
