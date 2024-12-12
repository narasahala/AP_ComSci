/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard [] wizard = new Wizard [100];
		Warrior [] warrior = new Warrior [100];
		for(int a = 0; a < wizard.length; a++){
			wizard[a] = new Wizard();
		}
		for (int a = 0; a <warrior.length; a++){
			warrior[a] = new Warrior();
		}
		int warriorDeadCounter = 0; 
		int wizardDeadCounter = 0;
		while(warriorDeadCounter<100 && wizardDeadCounter<100){
			warrior[warriorDeadCounter].attack(wizard[wizardDeadCounter]);
			if(wizard[wizardDeadCounter].isDead()){
				wizardDeadCounter++;
			}
			if(wizardDeadCounter == 100 || warriorDeadCounter == 100){
				break;
			}
			wizard[wizardDeadCounter].attack(warrior[warriorDeadCounter]);
			if(warrior[warriorDeadCounter].isDead()){
				warriorDeadCounter++;
			}
			if(wizardDeadCounter == 100 || warriorDeadCounter == 100){
				break;
			}
		}
		if(wizardDeadCounter>warriorDeadCounter){
			System.out.println("The warriors have won with " + (100-wizardDeadCounter) + " remaining");
		}
		else{
			System.out.println("The wizards have won with " + (100-wizardDeadCounter) +" remaining");
		}

	}
}
