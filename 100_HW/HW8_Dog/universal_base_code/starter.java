/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Name of the dog?");
	String dogName = sc.nextLine();
	Dog max = new Dog(dogName);
	max.setAge(10);
	Dog justin = new Dog("Justin", 10, "big red dog");
	System.out.println(dogName + " is a "  + max.getBreed() + " and is 1  years old!");
	System.out.println("Justin is a big red dog and is 10 years old!");
	if(max.isSleeping())
	{
		System.out.println(max.getName() + " is sleeping. Don't wake him up!");
		if(justin.isSleeping())
		{
			System.out.println(justin.getName() + " is sleeping.");
		}
		else{
			System.out.println("Justin is awake.");
		}
	}
	else
	{
		System.out.println("Max is awake!");
		max.bark();
		if(justin.isSleeping())
		{
			System.out.print("Justin was sleeping but woke up because of Max and ");
			justin.bark();
		}
		else{
			System.out.println("Justin is awake!");
			justin.bark();
	
		}
		
		}



	}
}
