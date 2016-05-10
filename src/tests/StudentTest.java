package tests;

import users.Student;

public class StudentTest {
	
	public static void main(String[] args) {
		
		
		boolean testBoolean = false;
		boolean testBoolean2 = false;
		Student Alex = new Student("aleli359", "Alexander Ling");
		if(Alex.getStudentId().equals("aleli359")) {
			testBoolean = true;
		}
	
		if(testBoolean) {
			System.out.println(Alex.getStudentId());
			System.out.println("Student ID test successful");
		}
		else {
			System.out.println("ID Not working");
		}
		
		if(Alex.getStudentName().equals("Alexander Ling")) {
			testBoolean2 = true;
		}
		
		if(testBoolean2) {
			System.out.println(Alex.getStudentName());
			System.out.println("Student name test is working");
		}
		else {
			System.out.println("Name not working");
		}
		

		
		
	}

}
