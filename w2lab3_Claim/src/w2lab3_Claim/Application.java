package w2lab3_Claim;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setFirstName("Bob");
		s1.setLastName("Newhart");
		Employee e1 = new Employee();
		e1.setFirstName("Rob");
		e1.setLastName("Newhart");
		Person p1 = new Student();
		p1.setFirstName("Bob");
		p1.setLastName("Nohart");
		Person p2 = new Employee();
		p2.setFirstName("Rob");
		p2.setLastName("Nohart");
		School school = new School();
		List<Student>studentArray=new ArrayList<Student>();
		studentArray.add(s1);
		studentArray.add((Student)p1);
		school.setStudents(studentArray);
		List<Employee>employeeArray=new ArrayList<Employee>();
		employeeArray.add(e1);
		employeeArray.add((Employee)p1);
		
		System.out.println(s1.toString());
		double telephoneBill = s1.calcuateTelephoneBill(120.5);
		System.out.println(telephoneBill);
		System.out.println(e1.toString());
		double telephoneBill2 = e1.calcuateTelephoneBill(120.5);
		System.out.println(telephoneBill2);
		System.out.println(p1.toString());
		double telephoneBill3 = p1.calcuateTelephoneBill(120.5);
		System.out.println(telephoneBill3);
		System.out.println(p2.toString());
		double telephoneBill4 = p2.calcuateTelephoneBill(120.5);
		System.out.println(telephoneBill4);	
	}

}
