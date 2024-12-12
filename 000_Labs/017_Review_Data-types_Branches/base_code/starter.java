/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the name of your adventurer?");
		String name = sc.nextLine();
		System.out.println("What is the name of your title of such adventurer?");
		String title = sc.nextLine();
		System.out.println("What to do you want to be: Wizard, Warrior, or a Rogue");
		String role = sc.nextLine();
		if(role.equals("Wizard"))
		{
			System.out.println("You are a Wizard!");
		}
		else if(role.equals("Warrior"))
		{
			System.out.println("You are a Warrior!");
		}
		else if(role.equals("Rogue"))
		{
			System.out.println("You are a Rogue!");
		}
		else
		{
			System.out.print("You did not select a right role.");
		}
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.println("");
		System.out.println("Strength (1-10): ");
		int strength = sc.nextInt();
		if(strength>10)
		{
			System.out.println("You put a value too high. Please select a lower number.");
			System.out.println("Strength (1-10): ");
			strength = sc.nextInt();
		}
		int pointsremaining = 20-strength;
		System.out.println("You have " + pointsremaining + " points left.");
		System.out.println("");
		System.out.println("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		if(dexterity>pointsremaining)
		{
			System.out.println("You put a value too high. Please select a lower number.");
			System.out.println("Dexterity (1-10): ");
			dexterity = sc.nextInt();
		}
		pointsremaining = pointsremaining - dexterity;
		System.out.println("You have " + pointsremaining + " points left.");
		System.out.println("");
		System.out.println("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		if(intelligence>pointsremaining)
		{
			System.out.println("You put a value too high. Please select a lower number.");
			System.out.println("Intelligence (1-10): ");
			intelligence = sc.nextInt();
		}
		pointsremaining = pointsremaining - intelligence;
		System.out.println("You have " + pointsremaining + " points left.");
		System.out.println("");
		System.out.println("Charisma (1-10): ");
		int charisma = sc.nextInt();
		if(charisma>pointsremaining)
		{
			System.out.println("You put a value too high. Please select a lower number.");
			System.out.println("Charisma (1-10): ");
			charisma = sc.nextInt();
		}
		pointsremaining = pointsremaining - charisma;
		System.out.println("You have " + pointsremaining + " points left.");
		System.out.println("You are " + name + ", the " + title + " of CVHS");
		System.out.println("You're a " + role + " with the following stats:");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma);
		System.out.println("");
		System.out.println("Good luck on your quest " + name);
	}
}
