
package examination;

import java.util.ArrayList;


public class GradeScale  {
	private String scaleName;
	private ArrayList<Grade> possibleGrades;
	
	public GradeScale(String scaleName) {
		possibleGrades = new ArrayList<>();
		this.scaleName = scaleName;
	}

	public void setGradeScale(Grade grade){
		possibleGrades.add(grade);
	}
	public ArrayList<Grade> getPossibleGrades() {
		return this.possibleGrades;
	}

	public String getScaleName() {

		return this.scaleName;
	}




}