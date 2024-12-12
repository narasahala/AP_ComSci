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
		int [] arr = new int [1000];
		int b = 0;
		for(int a = 0; a<1000; a++)
		{
			arr[b] = (int)(Math.random()*1000);
			System.out.println(arr[b]);
			b++;
		}


		
	}
}
