package com.claim;

public class Application {

	public static void main(String[] args) {
		Student student1 = new Student("dead", "guy");
		student1.setAge(89);
		student1.setGpa(0);
		Address studentAddress1 = new Address("Old Cematary Lane","Deceased","Ok","00666");
		student1.setAddress(studentAddress1);
		System.out.println(student1);
		
		Student student2 = new Student();
		student2.setFirstName("\nVu");
		student2.setLastName("vu");
		student2.setAge(25);
		student2.setGpa(3.1);
		student2.setTelephone("(817)625-8976");
		Address studentAddress2 = new Address("123 street","NY","NY","12345");
		student2.setAddress(studentAddress2);
		System.out.println(student2);
	}

}
