package users;

public class Student {
	
	private String studentID;
	private String studentName;
	
	
	/*
	 * VARNING VARNING VARNING VARNING *
	 * 
     * KONSTRUKTOR FINNS EJ I UML      *
	 * 
	 * GURRAPLS.
	 */
	public Student(String studentID, String studentName) {
		System.out.println("Student: " + studentName + " - " + studentID);
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public String getStudentId() {
		return this.studentID;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	
	

}
