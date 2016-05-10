package examination;

public class ExaminationRules {
	private GradeScale gradeScale;
	private String deadline;
	private int numberOfComp;
	
	public ExaminationRules(String deadline, int numberOfComp, GradeScale gS){
		gradeScale = gS;
		this.deadline = deadline;
		this.numberOfComp = numberOfComp;
		
	}
	
	public GradeScale getGradeScale(){
		return gradeScale;
	}
	public String getDeadline(){
		return deadline;
	}
	public int getNumberOfComp(){
		return numberOfComp;
	}
}
