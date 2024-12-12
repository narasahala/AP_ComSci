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
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a full name with a space seperating the first and last name:");
		String g = sc.nextLine();
		System.out.println("Last Name is:" + g.substring(g.indexOf(" "), g.length()));

		
	}
}
