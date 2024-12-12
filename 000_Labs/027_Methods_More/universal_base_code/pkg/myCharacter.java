/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter 
	{
		int strength;
		int dexterity;
		int intelligence;
		int charisma;
		String role;
		public myCharacter(String a) {
			role = a; 
			strength = 0;
			dexterity = 0;
			intelligence = 0;
			charisma = 0;
		}
		
		public void myToString(){
			System.out.println("-----------");
			System.out.println("Your role is: " + role);
			System.out.println("You have " + strength + " strength");
			System.out.println("You have " + dexterity + " dexterity");
			System.out.println("You have " + intelligence + " intelligence");
			System.out.println("You have " + charisma + " charisma");
			System.out.println("-----------");
			System.out.println("");
		}
		public String setRole(String a){
			if((a.equals("Warrior"))||(a.equals("Wizard"))||(a.equals("Rogue"))){
				return a;
			}
			else{
				System.out.println("You have not stated a right role.");
				return a;
			}
		}
		public int setStrength(int a){
			if(strength<0){
				strength = 0;
			}
			strength = a;
			return a;
		}
		public int setDexterity(int a){
			dexterity = a;
			return a;
		}
		public int setIntelligence(int a){
			intelligence = a;
			return a;
		}
		public int setCharisma(int a){
			charisma = a;
			return a;
		}
		public boolean setAll(String a, int b, int c, int d, int e){
			a = role;
			b = strength;
			c = dexterity;
			d = intelligence;
			e = charisma;
			if((role.equals("Warrior")) || (role.equals("Wizard"))||(role.equals("Rouge")) && (b >= 0) && (c >= 0) && (d >= 0) && (e>=0)){
				return true;
			}
			else{
				return false;
			}
		}
	}

