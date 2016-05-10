package courseinfo;
import java.util.ArrayList;

import users.Student;

public class StudentCatalog {
	
	private ArrayList<Student> students;
	
	public StudentCatalog(){
		students = new ArrayList<>();
	}
	
	public ArrayList<Student> getStudents(){
		return students;
	}
	public void addStudent(Student s){
		students.add(s);
	}
	
}