/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf drawfOne = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf drawfTwo = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf drawfThree = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf drawfFour = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf drawfFive = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf drawfSix= new PooleDwarf(randName(), (int)(Math.random()*10));
		int counter = 0;
		if(drawfOne.isSameName(drawfTwo.getName())){
			counter = counter + 1;
		}
		if(drawfOne.isSameName(drawfThree.getName())){
			counter = counter + 1;
		}
		if(drawfOne.isSameName(drawfFour.getName())){
			counter = counter + 1;
		}
		if(drawfOne.isSameName(drawfFive.getName())){
			counter = counter + 1;
		}
		if(drawfOne.isSameName(drawfSix.getName())){
			counter = counter + 1;
		}
		System.out.println(drawfOne.getName() + " name was duplicated " + counter + " times.");
	}
}
