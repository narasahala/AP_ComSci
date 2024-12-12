/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("You've joined an Alien Exchange Program!");
        System.out.println("Pick an Alien to take in!");
        System.out.println("1. Joe, a fat bellied alien who loves eating pizza");
        System.out.println("2. Bob, a blue alien who loves trees");
        System.out.println("3. Barney, a purple tailed alien who eats butteflies.");
        int answers= sc.nextInt();
        if(answers == 1)
        {
            System.out.println("You picked Joe!!! WOO!");
            System.out.println("Pop Quiz: What is Joe's favorite food? ");
            sc.nextLine();
            String answers1 = sc.nextLine();
            if(answers1 == "pizza")
            {
                System.out.println("Correct! Joe loves you forever. ");
            }
            else
            {
                System.out.println("Incorrect. Joe hates you forever. ");
            }
            
        }
        else if (answers == 2)
        {
            System.out.println("You picked Bob!!! WOO!");
            System.out.println("Pop Quiz: What is Bob's favorite plant");
            String answers2 = sc.nextLine();
            if(answers2 == "tree")
            {
                System.out.println("Correct! Bob loves you forever. ");
            }
            else
            {
                System.out.println("Incorrect. Bob hates you forever. ");
            }
        }
        else if (answers == 3)
        {
            System.out.println("You picked Barney!!! WOO!");
            System.out.println("Pop Quiz: What is Barney's Color?");
            String answers3 = sc.nextLine();
            if(answers3 == "purple")
            {
                System.out.println("Correct! Barney loves you forever. ");
            }
            else
            {
                System.out.println("Incorrect. Barney hates you forever. ");
            }
        }
        else
        {
            System.out.println("You picked Jerry!");
            System.out.println("What color should Jerry be:");
            System.out.println("1. Purple");
            System.out.println("2. Blue");
            System.out.println("3. White");
            int answers3 = sc.nextInt();
            if(answers3 == 1)
            {
                System.out.println("Jerry looks just like Barney");
            }
            else if(answers3 == 2)
            {
                System.out.println("Jerry looks like a blueberry");
            }
            else
            {
                System.out.println("Jerry looks like the light");
            }
        }
	}
}