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
		System.out.println("Enter a word:");
		String poop = sc.nextLine();
		System.out.println("Letter by letter:");
		for(int a = 0; a < poop.length(); a++){
			System.out.println(a + " "+ poop.substring(a,a+1));
		}


		
	}
}
