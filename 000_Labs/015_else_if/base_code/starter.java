/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int x = (int)(Math.random()*1000);
		System.out.println("Guess a number between 0-1000");
		int y = sc.nextInt();
		if(x<y)
		{
			System.out.println("You went too high try again!");
		}
		if(x>y)
		{
			System.out.println("You went too low try again!");
		}
		if(x==y)
		{
			System.out.println("You got it right");
		}
		
	}
}
