/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a integer: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter another integer: ");
		int num2 = sc.nextInt();
		if(num1%2==0)
		{
			System.out.println(num1 + " is divisible by 2");
		}
		else
		{
			System.out.println(num1 + " is not divisible by 2");
		}
		if(num1%3==0)
		{
			System.out.println(num1 + " is divisible by 3");
		}
		if(num1%4==0)
		{
			System.out.println(num1 + " is divisible by 4");
		}
		if(num1%5==0)
		{
			System.out.println(num1 + " is divisible by 5");
		}
		System.out.println("");
		if(num2%2==0)
		{
			System.out.println(num2 + " is divisible by 2");
		}
		else
		{
			System.out.println(num2 + " is not divisible by 2");
		}
		if(num2%3==0)
		{
			System.out.println(num2 + " is divisible by 3");
		}
		if(num2%4==0)
		{
			System.out.println(num2 + " is divisible by 4");
		}
		if(num2%5==0)
		{
			System.out.println(num2 + " is divisible by 5");
		}
	}
}
