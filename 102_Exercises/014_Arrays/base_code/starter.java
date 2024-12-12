/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int [1001];
		 int a = 0;
		 int i = 1001;
		 int e = 3;
		 while(i>0){
		 	i--;
		 	arr[a] = e;
		 	e = e+3;
		 	System.out.println(arr[a]);
		 }
		 int [] arr1 = new int [1001];
		 int b = 0;
		 int w = 1001;
		 while(w>0){
		 	w--;
		 	arr1[b] = w;
		 	System.out.println(arr1[b]);
		 }
	}
}
