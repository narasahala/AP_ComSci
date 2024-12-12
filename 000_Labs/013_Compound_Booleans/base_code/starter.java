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
		System.out.println("Please enter a number: ");
		int num1 = sc.nextInt();
		System.out.println("please enter another number: ");
		int num2 = sc.nextInt();
		System.out.println("please enter another another number: ");
		int num3 = sc.nextInt();
		if((num1>num2) && (num1>num3))
		{
			System.out.println(num1 + " is the greatest integer");
		}
		if((num2>num1) && (num2>num3))
		{
			System.out.println(num2 + " is the greatest integer");
		}
		if((num3>num1) && (num3>num2))
		{
			System.out.println(num3 + " is the greatest integer");
		}
		if((num1<num2) && (num1<num3))
		{
			System.out.println(num1 + " is the smallest integer");
		}
		if((num2<num1) && (num2<num3))
		{
			System.out.println(num2 + " is the smallest integer");
		}
		if((num3<num1) && (num3<num2))
		{
			System.out.println(num3 + " is the smallest integer");
		}
	}
}
