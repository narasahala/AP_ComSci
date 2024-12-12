/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2472, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.0);
		Employee daniel = new Employee(2008, "Danil", "Zhukov", 5000.0);
		dwight.raiseSalary(10);
		jim.raiseSalary(12);
		pam.raiseSalary(15);
		daniel.raiseSalary(10);
		double dwightSalary = dwight.getSalary();
		double dwightAnnualSalary = dwight.getAnnualSalary();
		double jimSalary= jim.getSalary();
		double jimAnnualSalary = jim.getAnnualSalary();
		double pamSalary = pam.getSalary();
		double pamAnnualSalary = pam.getAnnualSalary();
		double danielSalary = daniel.getSalary();
		double danielAnnualSalary = daniel.getAnnualSalary();
		System.out.println(dwight.getFirstName() + " " +dwight.getLastName() + "'s salary is : " + dwight.getSalary() +" and his annual salary is: "+ dwight.getAnnualSalary());
		System.out.println(jim.getFirstName() + " " + jim.getLastName() + "'s salary is: " + jim.getSalary() + " and his annual salary is: " + jim.getAnnualSalary());
		System.out.println(pam.getFirstName() + " " + pam.getLastName() + "'s salary is: " + pam.getSalary() + " and her annual salary is: " + pam.getAnnualSalary());
		System.out.println(daniel.getFirstName() + " " + daniel.getLastName() + "'s salary is: " + daniel.getSalary() + " and his annual salary is: " + daniel.getAnnualSalary());
	}
}
