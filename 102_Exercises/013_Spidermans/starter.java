/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman x = new Spiderman();
		x.setActor("Tobey Maguire");
		x.setAge(49);
		x.setVillian("Green Goblin");
		Spiderman y = new Spiderman("Andrew Garfield", 41, "Electro");
		
		Spiderman z = new Spiderman("Tom Holland");
		z.setAge(28);
		z.setVillian("The Vulture");
		
		System.out.println(y.getVillian());
		
		Spiderman a = new Spiderman(28);
		a.setActor("Hailee Steinfield");
		a.setVillian("Doctor Octupus");
		

		
	}
}
