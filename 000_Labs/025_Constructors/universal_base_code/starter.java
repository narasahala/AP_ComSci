/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter class1= new myCharacter("noRole");
		class1.giveRoleStats();
		System.out.println("What class do you want to become: ");
		String role = sc.nextLine();
		if(role.equals("Warrior") || role.equals("Wizard") || role.equals("Rogue")){
			myCharacter class2 = new myCharacter(role);
			class2.giveRoleStats();
		}
		else{
			System.out.println("Your input isn't correct. Please select a right role: ");
			role = new String("noRole");
			myCharacter class2 = new myCharacter(role);
			class2.giveRoleStats();
		}


		
	}
}
