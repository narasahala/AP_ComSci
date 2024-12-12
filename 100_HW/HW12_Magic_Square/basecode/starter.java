import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		System.out.println(CVMath.findMid(2,3,1));
		Scanner sc = new Scanner(System.in);
		System.out.println("How many special squares do you want to output?");
		int a = sc.nextInt();
		SpecialSquare(a);
	}
	public static void SpecialSquare(int x){
		int c = 0;
		int e = 1;
		int d = 1;
		for(int b = 0; b < x; b++){
			while(true){
				if(c>(d*d)){
					d++;
				}
				c = c+e;
				if(c==(d*d)){
					System.out.println(c);
					break;
				}
				e++;
			}
		}
	}
}	
