/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;
class Character{
	String role = new String("Wizard");
	int strength = 2;
	int dexterity = 3;
	int intelligence = 5;
	int charisma = 5;
}
class starter {
	public static void main(String args[]) {
		Character myCharacter = new Character();
		System.out.println(myCharacter.strength);
		System.out.println(myCharacter.dexterity);
		System.out.println(myCharacter.intelligence);
		System.out.println(myCharacter.charisma);



		
	}
}
