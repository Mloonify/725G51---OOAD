package examination;

import courseinfo.Course;
import courseinfo.CourseTask;
import registration.Registration;
import users.Student;

public class ExaminationPlace {
	private Course course;
	private CourseTask courseTask;
	private Registration registration;
	private Student student;
	
	public ExaminationPlace(Course c, CourseTask cT, Student s){
		this.course = c;
		this.courseTask = cT;
		this.student = s;
	}
	
	public void setCourse (Course course){
		this.course = course;
	}
	public Course getCourse(){
		return course;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	public Student getStudent(){
		return student;
	}
	
	public void setCourseTask (CourseTask courseTask) {
		this.courseTask = courseTask;
	}
	public CourseTask getCourseTask(){
		return courseTask;
	}
	public Registration getRegistration(){
		return registration;
	}
	
	public void createRegistration (Grade grade, String comment){
		registration = new Registration(grade, comment); //?
	}
	
	public void sendGradeToLadok(){
		//send grade to Integration stuff
		System.out.println("Grade has been sent to Ladok");
	}
	
	public void notifyStudent(){
		//send notification to Student
		System.out.println("Notification has been sent to Student");
	}
	
}