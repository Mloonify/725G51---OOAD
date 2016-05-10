package tests;

import examination.Grade;

public class GradeTest {
	public static void main(String[] args) {
		Grade grade = new Grade("VG");
		Boolean testBoolean = true;
		if(grade.getGrade() != "VG"){
			testBoolean = false;
		}
		if(testBoolean){
			System.out.println("Gradetest successful!");
		}else{
			System.out.println("Gradetest failed!");
		}
	}
}
