/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter what day it is (0-6): ");
		int day = sc.nextInt();
		if(day==0)
		{
			System.out.println("It's the weekend! It's 10AM!");
		}
		else if (day==6)
		{
			System.out.println("It's the weekend! It's 10AM!");
		}
		else
		{
			System.out.println("Its a weekday! Wake up! It's 7AM!");
		}
	}
}
