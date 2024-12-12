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
		int a = (int)(Math.random()*150)+51;
		int [] arr = new int [a];
		System.out.println("There are " + a + " elements.");
		for(int b = a; b > 0; b--){
			int c = b - 1;
			arr[c] = (int)(Math.random()*99)+1;
		}
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("The lowest integer in the array is "+ min);
		int max = arr[0];
		for(int e = 0; e<arr.length; e++){
			if(arr[e]>max){
				max = arr[e];
			}
		}
		System.out.println("The highest integer in the array is " + max);
		int avg = 0;
		for(int o = 0; o<a; o++){
			avg = avg + arr[o];
		}
		avg = avg/a;
		System.out.println("The average of the array is " + avg);
		


		
	}
}
