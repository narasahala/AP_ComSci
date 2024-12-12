/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a){
		int num = a -1;
		while(num>1)
		{
			if((a%num)==0)
			{
				return false;
			}
			num--;
		}
		return true;
	}
	public static void printPrimes(int b){
		int num = 2;
		while(b>num){
			if(checkPrime(num))
			{
				System.out.println(num);
			}
			num++;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int poop = sc.nextInt();
		printPrimes(poop);
	}
}
