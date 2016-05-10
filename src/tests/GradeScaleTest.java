
package tests;

import java.util.Iterator;

import examination.Grade;
import examination.GradeScale;


public class GradeScaleTest {

	public static void main (String [] args) {
		Grade g = new Grade ("G");
		Grade vg = new Grade ("VG");
		Grade u = new Grade ("U");
		Grade fem = new Grade ("5");
		Grade underkant = new Grade ("u");
		Grade fyr = new Grade ("4");
		Grade tre = new Grade ("3");

		GradeScale filfak = new GradeScale("Filfak");
		GradeScale tekniska = new GradeScale ("Tekniska");

		tekniska.setGradeScale(tre);
		tekniska.setGradeScale(fyr);
		tekniska.setGradeScale(fem);
		tekniska.setGradeScale(underkant);
		filfak.setGradeScale(g);
		filfak.setGradeScale(vg);
		filfak.setGradeScale(u);

		for (int i = 0; i < tekniska.getPossibleGrades().size(); i++) {
			System.out.println(tekniska.getPossibleGrades().get(i).getGrade());

		}






		System.out.println(filfak.getScaleName());
		for (int i = 0; i < filfak.getPossibleGrades().size(); i++) {
			System.out.println(filfak.getPossibleGrades().get(i).getGrade());



		}
	}

}
