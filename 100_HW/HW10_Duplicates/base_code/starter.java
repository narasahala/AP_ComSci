/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [20];
		int b = (int)(Math.random()*10+1);
		int counter = 0;
		System.out.println("----------------------");
		System.out.println("");
		System.out.println("These are the 20 numbers in the index");
		for(int a = 0; a<20; a++){
			arr[a] = (int)(Math.random()*10);
			System.out.print(arr[a] + " ");
		}
		System.out.println("");
		System.out.println("----------------------");
		System.out.println("The random number to look for is " + b);
		for(int a = 0; a<20; a++){
			if(arr[a]==b){
				System.out.println("A duplicate is found in index " + a);
				counter++;
			}
		}
		System.out.println("The number of dulpicates found is " + counter);
		for(int a = 1; a<20; a++){
			int c = a - 1;
			if(arr[a]==arr[c]){
				System.out.println("Two numbers are the same in a row at " + a + " index.");
			}
		}
		
		
		

	}
}
