/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What to do you want to be: Wizard, Warrior, or a Rogue");
		String role = sc.nextLine();
		if(role.equals("Wizard"))
		{
			System.out.print("You are a Wizard!");
		}
		else if(role.equals("Warrior"))
		{
			System.out.print("You are a Warrior!");
		}
		else if(role.equals("Rogue"))
		{
			System.out.println("You are a Rogue!");
		}
		else
		{
			System.out.print("You did not select a right role.");
		}
	}
}
