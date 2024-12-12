/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int num = pow(2,6);
		System.out.println(num);



		
	}
	public static int pow(int num, int power){
		int amount = 1;
		while(power>0){
			amount = amount * num;
			power--;
		}
		return amount;
	}
}
