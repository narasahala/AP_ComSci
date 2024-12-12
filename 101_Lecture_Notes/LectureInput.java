/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = sc.nextLine();
        System.out.println("hello "+ name);
        System.out.println("Please enter a random number: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter another random number: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        int num3 = num1 + num2;
        System.out.println("the sum of these numbers is " + num3);  
        System.out.println("what is your favorite food");
        String food = sc.nextLine();
	}
}