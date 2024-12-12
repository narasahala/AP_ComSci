/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	
	public class myCharacter {
		int strength;
		int dexterity;
		int intelligence;
		int constitution;
		int charisma;
		String role;
		public myCharacter(String a) {
			role = a; 
			strength = 0;
			dexterity = 0;
			intelligence = 0;
			constitution = 0;
			charisma = 0;
		}
		
		public void myToString(){
			System.out.println("-----------");
			System.out.println("Your role is: " + role);
			System.out.println("You have " + strength + " strength");
			System.out.println("You have " + dexterity + " dexterity");
			System.out.println("You have " + intelligence + " intelligence");
			System.out.println("You have " + constitution + " consitution");
			System.out.println("You have " + charisma + " charisma");
			System.out.println("-----------");
			System.out.println("");
		}
	}
}

