package courseinfo;

import examination.ExaminationPlace;
import users.Student;
import examination.Grade;
import examination.GradeScale;

import java.util.ArrayList;

public class CourseHandler {

	private ArrayList<Course> courses;
	private ExaminationPlace currentExPlace;
	private ArrayList<GradeScale> gradeScales; 
	
	public CourseHandler(){
		courses = new ArrayList<>();
		gradeScales = new ArrayList<>();
	}
	
	public ArrayList<ArrayList> fetchCourseInfo(Course course){
		ArrayList<ArrayList> list = new ArrayList<>();
		list.add(course.getCourseTasks());
		list.add(course.getStudents());
		return list;
	}
	public void register(Grade grade, String comment){
		currentExPlace.createRegistration(grade, comment);
	}
	public void selectCourseTaskAndStudent(CourseTask task, Student student){
		currentExPlace = task.findExaminationPlace(student);
	}
	public void addCourse(Course c){
		courses.add(c);
	}
	public ArrayList<Course> getCourses(){
		return courses;
	}
	public void addGradeScale(GradeScale scale){
		gradeScales.add(scale);
	}
	public ArrayList<GradeScale> getGradeScales(){
		return gradeScales;
	}
	public GradeScale getGradeScaleByName(String scaleName){
		for (GradeScale gS : gradeScales){
			if (gS.getScaleName() == scaleName){
				return gS;
			}
		} 
		return null;
		
	}
	
}
