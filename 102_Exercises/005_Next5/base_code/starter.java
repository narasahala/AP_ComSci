/*
 *	Author: 
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a random integer: ");
	int num = sc.nextInt();
	System.out.println("The next five numbers following " + num + " is : " + (num + 1) + " "+(num + 2) +" "+ (num + 3) + " "+(num + 4) + " " + (num + 5));
	System.out.println("The following 5 multiples of " + num + " is : "+ (num * 2)+ " "+ (num *3) + " " + (num *4) + " " + (num * 5) + " " + (num * 6));
	double num2 = 100;
	double num1 = 10;
	System.out.println("Here is " + num + " divided by 100 : " + (num/num2));
	System.out.println("Here is "+ num + " divided by 10: " + (num/num1));
	}
}
