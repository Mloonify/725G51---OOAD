
package tests;

import examination.Grade;
import registration.Registration;


public class RegistrationTest {

	public static void main (String [] args) {
		Grade hej = new Grade ("g");
		Registration regTest = new Registration (hej, "hola");
		boolean testBoolean = true;
		if (regTest.getComment() != "hola"){
			testBoolean = false;
		}
		if (regTest.getGrade().getGrade() != "g"){
			testBoolean = false;
		}
		if (testBoolean){
			System.out.println("Registrationtest successful!");
		}
		else{
			System.out.println("Registrationtest failed!");
		}
	}
}


