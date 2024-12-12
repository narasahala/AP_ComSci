/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Slot Machine Rules:"); 
	System.out.println("1. You start with $100.");
	System.out.println("2. Input a wager less than your total amount of money.");
	System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
	System.out.println("a. If two numbers match, you double your money.");
	System.out.println("b. If three numbers match, you triple your money.");
	System.out.println("c. If none match, you lose your money.");
	System.out.println("--------------------------------------------------");
	String accept;
	int dollars;
	int wager;
	int num1;
	int num2;
	int num3;
	dollars = 100;
	while(true)
	{	System.out.print("Would you like to play slots? (Yes, yes, y, Y): ");
		accept = sc.nextLine();
		if(accept.equals("yes") || accept.equals("Yes") || accept.equals("y") || accept.equals("Y"))
		{
			System.out.println("You have "+ dollars +". How many do you want to spend?");
			wager = sc.nextInt();
			sc.nextLine();
			if(wager>dollars)
			{
				System.out.print("Please choose a smaller number: ");
				wager= sc.nextInt();
			}
			if(wager<=dollars)
			{
				num1 = (int)(Math.random()*11);
				num2 = (int)(Math.random()*11);
				num3 = (int)(Math.random()*11);
				System.out.println("Okay, lets play!");
				System.out.println("Your rolls are: ");
				System.out.println("_______________________");
				System.out.println(" | "+ num1 + " | " + num2 + " | " + num3 + " | ");
				System.out.println("_______________________");
				
				if(num1==num2 || num2 == num3 || num3 == num1)
				{
					System.out.println("You won! Your bet has now doubled!");
					dollars = (2*wager) + dollars;
				}
				else if (num1==num2 && num2==num3)
				{
					System.out.println("Jackpot! Your bet has now tripled!");
					dollars = (3*wager) + dollars;
				}
				else
				{
					System.out.println("You lost. Try again!");
					dollars = dollars - wager;
				}
				
			}
			if(dollars==0)
			{
				System.out.println("You ran out of money! Come again!");
				break;
			}
			
		}
		if(accept.equals("no"))
		{
			System.out.println("You left the bank with " + dollars + " dollars.");
			break;
		}
	}
	}
}
