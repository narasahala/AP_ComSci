/* 
    Lecture note example - Methods
*/

class LectureMethod{
    
    public static void main(String args[]) {
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        greeting("Spike");
        greeting("Mortis");
        double num = raise(200000.42, 5);
        System.out.println(num);
        num = raise(num,5);
        System.out.println(num);
	}
	
	public static void printAnimal(){
        System.out.println("    \\\\_//");
        System.out.println("   __/\".");
        System.out.println("  /__ |");
        System.out.println("  || ||");
	}
	
	public static void greeting(String name){
	    System.out.println("Howdy " + name);
	}
	
	public static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
}