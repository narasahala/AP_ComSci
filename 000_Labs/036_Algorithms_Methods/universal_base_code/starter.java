/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int [] x){
			for(int b = 1; b < x.length; b++){
			int c = b - 1;
			x[c] = (int)(Math.random()*99)+1;
			System.out.print(x[c] + " ");
		}
	}
	public static int getArrayMin(int [] x){
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < x.length; i++){
			if(x[i]<min){
				min = x[i];
			}
		}
			return min;
		}
	public static int getArrayMax(int [] x){
		int max = x[0];
		for(int e = 0; e<x.length; e++){
		if(x[e]>max){
			max = x[e];
		}
	}
		return max;
	}
	public static int getAverage(int [] x){
			int avg = 0;
			for(int o = 0; o<x.length; o++){
			avg = avg + x[o];
		}
			avg = avg/x.length;
			return avg;
		}
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int a = (int)(Math.random()*150)+51;
		int [] arr = new int [a];
		System.out.println("There are " + a + " elements.");
		toStringArray(arr);
		System.out.println("");
		System.out.println(getAverage(arr));
		System.out.println(getArrayMax(arr));
		System.out.println(getArrayMin(arr));
		


		
	}
}
