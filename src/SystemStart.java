import java.util.ArrayList;

import courseinfo.Course;
import courseinfo.CourseHandler;
import courseinfo.CourseTask;
import courseinfo.StudentCatalog;
import examination.ExaminationPlace;
import examination.ExaminationRules;
import examination.Grade;
import examination.GradeScale;
import users.Student;

public class SystemStart {
	public static void main(String[] args) {
		CourseHandler handler = new CourseHandler();
		
		ArrayList<Course> courseList = new ArrayList<>();
		courseList.add(new Course("Projektledning - fördjupning" , "725G51"));
		courseList.add(new Course("Datastrukturer och algoritmer", "725G82"));
		courseList.add(new Course("Affärssystem", "725G01"));
		courseList.add(new Course("IT-Design", "725G49"));
		courseList.add(new Course("Kalkylering", "725G28"));
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("gusle111","Gustav L'Estrade"));
		students.add(new Student("jaski222", "Jasmin Kiviniemi"));
		students.add(new Student("willu333", "William Luxenburg"));
		students.add(new Student("aleli666", "Alexander Ling"));
		
		GradeScale filfak = new GradeScale("Filosofiska");
		GradeScale tekniska = new GradeScale ("Tekniska");

		tekniska.setGradeScale(new Grade ("3"));
		tekniska.setGradeScale(new Grade ("4"));
		tekniska.setGradeScale(new Grade ("5"));
		tekniska.setGradeScale(new Grade ("u"));
		filfak.setGradeScale(new Grade ("G"));
		filfak.setGradeScale(new Grade ("VG"));
		filfak.setGradeScale(new Grade ("U"));
		
		handler.addGradeScale(filfak);
		handler.addGradeScale(tekniska);

		
		
		for (Course c : courseList){
			handler.addCourse(c);
			c.addCourseTask(new CourseTask("Uppgift 1"));
			c.addCourseTask(new CourseTask("Uppgift 2"));
			c.addCourseTask(new CourseTask("Uppgift 3"));
			c.setStudentCatalog(new StudentCatalog());
			StudentCatalog tempCatalog = c.getStudentCatalog();
			for(Student s : students){
				tempCatalog.addStudent(s);
			}
			for(CourseTask task : c.getCourseTasks()){
				for (Student stud : c.getStudents()){
					task.addExaminationPlace(new ExaminationPlace(c, task, stud));
				}
				task.setRules(new ExaminationRules("10-06-16 23:59", 3, handler.getGradeScaleByName("Filosofiska")));
			}
			
		}
		
		System.out.println("Systemstart färdig");
		
	}
}
