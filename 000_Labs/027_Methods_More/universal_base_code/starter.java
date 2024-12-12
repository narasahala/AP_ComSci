/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		myCharacter class1= new myCharacter("noRole");
		class1.myToString();
		System.out.println("What class do you want to become: ");
		String role = sc.nextLine();
		myCharacter class2 = new myCharacter(role);
		String a = class2.setRole(role);
		int c = class2.setDexterity(10);
		int d = class2.setIntelligence(10);
		int e = class2.setCharisma(10);
		int b = class2.setStrength(10);
		if(class2.setAll(role,10,10,10,10))
		{
			class2.myToString();
		}

		
	}
}
