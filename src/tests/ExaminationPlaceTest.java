package tests;

import courseinfo.Course;
import courseinfo.CourseTask;
import examination.ExaminationPlace;
import examination.Grade;
import users.Student;

public class ExaminationPlaceTest {
	public static void main(String[] args) {
		Course course = new Course("Kurstest", "725G00");
		CourseTask courseTask = new CourseTask("Testmoment");
		Student student = new Student("Ricgu333","Richard");
		course.addCourseTask(courseTask);
		
		ExaminationPlace testPlace = new ExaminationPlace(course, courseTask, student);
		
		testPlace.createRegistration(new Grade("VG"), "testing, testing");
		Boolean testBoolean = true;
		if (testPlace.getRegistration().getGrade().getGrade() != "VG"){
			testBoolean = false;
		}
		if(testPlace.getRegistration().getComment() != "testing, testing"){
			testBoolean = false;
		}
		if (testPlace.getCourse().getName() != "Kurstest"){
			testBoolean = false;
		}
		if (testPlace.getStudent().getStudentName() != "Richard"){
			testBoolean = false;
		}
		if(testPlace.getCourseTask().getName() != "Testmoment"){
			testBoolean = false;
		}
		if(testBoolean){
			System.out.println("ExaminationPlaceTest is successful!");
		}else{
			System.out.println("ExaminationPlaceTest failed!");
		}
	}
	
	
}
