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
		int b = 13-6*11;
		int c = 30%7*(-2);
		int d = 3*8+31%7;
		int e = 37/3;
		int f = 35%21;
		int g = 2;
		int h = 14%3;
		int i = 2*6;
		System.out.println(Math.max(b,c));
		System.out.println(Math.sqrt(d));
		System.out.println(Math.pow(e,f));
		System.out.println(Math.max(Math.pow(g,h), Math.sqrt(i)));
		System.out.println("Put a random integer: ");
		int num1 = sc.nextInt();
		System.out.println("Put another raundom interger: ");
		int num2 = sc.nextInt();
		System.out.println("The max of the two values is: " + Math.max(num1,num2));
		System.out.println("The square root of " + num2+ " is: " + Math.sqrt(num2));
		System.out.println("The power of " + num1 +" to the power of " + num2 +" is: " + Math.pow(num1,num2));
		
	}
}
