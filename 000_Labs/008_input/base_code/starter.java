/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String poo = sc.nextLine();
		System.out.println("What is your age?");
		int poo2 = sc.nextInt();
		System.out.println("What month were you born in (1-12): ");
		int poo3 = sc.nextInt();
		System.out.println("What day were you born?");
		int poo4 = sc.nextInt();
		System.out.println("What year were you born in:");
		int poo5 = sc.nextInt();
		System.out.println("How much money does a dollar and 2 quarters give you?");
		double poo6 = sc.nextDouble();
		System.out.println("Your name is "+ poo+ " and you were born in "+ poo3+"/"+poo4+"/"+poo5);
		System.out.println("You are "+ poo2 +" years old!");
		System.out.print("You have $"+ poo6 +" in your wallet.");
	}
}
