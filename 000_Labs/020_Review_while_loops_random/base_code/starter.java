/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int c = (int)(Math.random()*1001);
		int guess;
		while(true)
		{
			System.out.println("Guess the number: ");
			guess = sc.nextInt();
			if(guess==c)
			{
				System.out.println("You got it right!");
				break;
			}
			System.out.println("Try again!");
		}


		
	}
}
