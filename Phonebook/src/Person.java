
class Person {
	public String name = "Roy Wright";
	String address = "123 anystreet stl, MO, 63114";
	public String telephone = "3144131177"; 
	

   @Override
   public String toString() {
        return ("\nName:"+this.getName()+
                    " Phone No: "+ this.getTelephone());
   }
   public Person() {}
   public Person(String userInput, String telephone) {
		this.name = userInput;
		this.telephone = telephone;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getTelephone() {
		return telephone;
	}
	private void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}
