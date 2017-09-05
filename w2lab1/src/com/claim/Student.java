package com.claim;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private String telephone;
	private double gpa;
	private Address address;
	
	
	public Student() {}
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
				
	}
	public String toString() {		
		String displayInfo= getFirstName()+" "+ getLastName()+"\nAge "+ 
				getAge()+" GPA: "+getGpa()+"\n"+getTelephone()+
				"\n"+address;
		return displayInfo;
	}
	
	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	
}
