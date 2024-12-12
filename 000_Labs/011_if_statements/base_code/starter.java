/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num1 = sc.nextInt();
		System.out.println("Please enter another number: ");
		int num2 = sc.nextInt();
		boolean x = num1 != num2;
		if (x)
		{
			System.out.println(num1 + " and "+ num2 + " arent the same");
		}
	}
}
