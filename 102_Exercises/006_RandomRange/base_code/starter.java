/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter one integer: ");
		int num1 = sc.nextInt();
		System.out.println("Please enter another integer (greater than the first) : ");
		int num2 = sc.nextInt();
		System.out.println("Your range of numbers is " + num1 + " to " + num2);
		System.out.println("Here is five random numbers from that range: ");
		int num3 = num2 - num1;
		int num4 = (int)(Math.random()*num3)+num1;
		int num5 = (int)(Math.random()*num3)+num1;
		int num6 = (int)(Math.random()*num3)+num1;
		int num7 = (int)(Math.random()*num3)+num1;
		int num8 = (int)(Math.random()*num3)+num1;
		System.out.println(num4 + " " + num5 + " " + num6 + " " + num7+ " " + num8);
	}
}
