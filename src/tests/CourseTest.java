package tests;

import java.util.ArrayList;

import courseinfo.Course;
import courseinfo.CourseTask;
import courseinfo.StudentCatalog;
import users.Student;

public class CourseTest {

	/**
	 * tests creating courses and coursetasks,
	 * also getting list of cousetasks and checking size
	 */
	private static void testAddandGetCourseTask(){
		//create course
		Course testCourse = new Course("Testkurs", "t01");

		//get list with tasks for current course
		ArrayList<CourseTask> taskList = testCourse.getCourseTasks();

		//check if list is empty
		if (!taskList.isEmpty()){
			System.err.println("Error, size "+taskList.size()+" when expected empty");
		}

		//create a couple of courseTasks and check list size after each added task
		testCourse.addCourseTask(new CourseTask("Moment 1"));
		if (taskList.size()!= 1){
			System.err.println("Error, size "+taskList.size()+" when expected 1");
		}

		testCourse.addCourseTask(new CourseTask("Moment 2"));
		if (taskList.size()!= 2){
			System.err.println("Error, size "+taskList.size()+" when expected 1");
		}

		testCourse.addCourseTask(new CourseTask("Moment 3"));
		if (taskList.size()!= 3){
			System.err.println("Error, size "+taskList.size()+" when expected 1");
		}

		testCourse.addCourseTask(new CourseTask("Moment 4"));
		if (taskList.size()!= 4){
			System.err.println("Error, size "+taskList.size()+" when expected 1");
		}
		else {
			System.out.println("testAddCourseTask: ok");
		}
	}

	//OBS! detta behöver utökas
	public static void testSetandGetStudentCatalog(){
		//create course
		Course testCourse = new Course("Testkurs", "t02");

		//set student catalog
		testCourse.setStudentCatalog(new StudentCatalog());

		ArrayList<Student> testCatalog = testCourse.getStudents();
		testCatalog.add(new Student("test", "Test McTestson"));

		if (testCatalog.isEmpty()){
			System.err.println("Error, StudentCatalog empty.");
		}
		else {
			System.out.println("testSetStudentCatalog: ok");
		}
	}

	public static void main(String[] args) {
		testAddandGetCourseTask();
		testSetandGetStudentCatalog();
	}

}
