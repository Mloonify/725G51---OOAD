
package registration;
import java.text.SimpleDateFormat;

import java.util.Calendar;

import examination.Grade;

public class Registration {
	private Grade grade;
	private String comment;

	private String dateTimeStamp;

	//lägga till dateStamp och timeStamp till UML
	public Registration(Grade grade, String comment) {
		this.grade = grade;
		this.comment= comment;
		this.dateTimeStamp = setTimeStamp();
		

	}    

	public String setTimeStamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
	}
	public String getComment(){
		return comment;
	}
	public String getDateTimeStamp(){
		return dateTimeStamp;
	}
	public Grade getGrade(){
		return grade;
	}

}
