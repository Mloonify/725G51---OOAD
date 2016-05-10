package courseinfo;
import java.util.ArrayList;

import examination.ExaminationPlace;
import examination.ExaminationRules;
import users.Student;

public class CourseTask {
	
	private ExaminationRules rules;
	private String description;
	private ArrayList<ExaminationPlace> examinationPlaces;
	private String name;

	public CourseTask(String name){
		
		this.name = name;
		examinationPlaces = new ArrayList<>();
	}
	
	public ExaminationRules getRules() {
		return rules;
	}
	public void setRules(ExaminationRules rules){
		this.rules = rules;
	}

	public String getDescription() {
		return description;
	}
	public ExaminationPlace findExaminationPlace(Student s){
		for (ExaminationPlace e : examinationPlaces){
			if (e.getStudent() == s){
				return e;
			}
		}
		return null;
	}
	public void addExaminationPlace(ExaminationPlace e){
		this.examinationPlaces.add(e);
	}
	public String getName(){
		return name;
	}
	public ArrayList<ExaminationPlace> getExaminationPlaces(){
		return examinationPlaces;
	}
}
