/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static boolean isLeapYear(int a){
		if((a%4)==0)
		{
			return true;
		}
		return false;
	}
	public static int getDigitSum(int b){
		int stink = 100000;
		int stink2 = 10000;
		int stink3 = 1000;
		int stink4 = 100;
		int stink5 = 10;
		int summers = 0;
		while(true)
		{
			stink = stink - 10000;
			if(b>=stink)
			{
				stink = (stink/10000);
				summers = summers + stink;
				stink = (stink*10000);
				b = b - stink;
				break;
			}
			
		}
		while(true)
		{
			stink2 = stink2 -1000;
			if(b>=stink2)
			{
				stink2 = (stink2/1000);
				summers = summers + stink2;
				stink2 = (stink2*1000);
				b = b - stink2;
				break;
			}
		}
		while(true)
		{
			stink3 = stink3 -100;
			if(b>= stink3)
			{
				stink3 = (stink3/100);
				summers = summers + stink3;
				stink3 = (stink3*100);
				b = b - stink3;
				break;
			}
		}
		while(true){
			stink4 = stink4 -10;
			if(b>=stink4)
			{
				stink4 = (stink4/10);
				summers = summers + stink4;
				stink4 = (stink4*10);
				b = b - stink4;
				break;
			}
		}
		while(true){
			stink5 = stink5 -1;
			if(b>=stink5)
			{
				stink5 = (stink5/1);
				summers = summers + stink5;
				b = b - stink5;
				break;
			}
		}
		return summers;
	}
	public static void printIfConsecutive(int a, int b, int c){
		String poop = "They are consecutive.";
		String pooper = "They are not consecutive.";
		if(((a+1)==b) && ((b+1)==c))
		{
			System.out.println(poop);
		}
		else
		{
			System.out.println(pooper);
		}
	}
	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
