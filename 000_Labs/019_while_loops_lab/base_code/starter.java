/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is a random name");
		String name = sc.nextLine();
		System.out.println("How many times should the name be outputted");
		int num = sc.nextInt();
		int counter = 0;
		while(true)
		{
			System.out.println(name);
			if(counter == num)
			{
				break;
			}
			counter = counter + 1;
		}



		
	}
}
