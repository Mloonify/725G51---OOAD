package courseinfo;

import java.util.ArrayList;
import courseinfo.StudentCatalog;
import users.Student;

public class Course {
	private ArrayList<CourseTask> courseTasks;
	private StudentCatalog studentCatalog;
	private String courseCode;
	private String name;
	private String description;
	
	//Added
	public Course(String name, String courseCode){
		System.out.println("Kurs: " + courseCode + " - " + name);
		this.name = name;
		this.courseCode = courseCode;
		courseTasks = new ArrayList<>();
	}
	//Added
	public void addCourseTask(CourseTask courseTask){
		System.out.println("Kursmoment: " + courseTask.getName() + " för kurs " + name);
		courseTasks.add(courseTask);
	}
	//Added
	public void setStudentCatalog(StudentCatalog catalog){
		this.studentCatalog = catalog;
	}
	
	public ArrayList<CourseTask> getCourseTasks(){
		return courseTasks;
	}
	public ArrayList<Student> getStudents(){
		return studentCatalog.getStudents();
	}
	public StudentCatalog getStudentCatalog(){
		return studentCatalog;
	}
	public String getName(){
		return name;
	}
	
}
