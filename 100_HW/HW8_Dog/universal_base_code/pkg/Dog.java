package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	int age; 
	String name;
	String breed;
	public Dog() {
		age = 3;
		name = "Clifford";
		breed = "big red dog";
	}
	public Dog(String a)
	{
		name = a;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String c, String b)
	{
		name = c;
		breed = b;
		age = 1;
	}
	public Dog(String d, int e){
		name = d;
		breed = "dog dog";
		e = age;
	}
	public Dog(String a, int b, String c){
		name = a;
		b = age;
		c = breed;
	}
	public void setName(String a){
		name = a;
	}
	public void setAge(int a){
		age = a;
	}
	public void setBreed(String a){
		breed = a;
	}
	public String getName(){
		return name;
	}
	public String getBreed(){
		return breed;
	}
	public int getAge(){
		return age;
	}
	public void bark(){
		System.out.println(name + " barks!");
	}
	int random = (int)(Math.random()*2);
	public boolean isSleeping(){
		if(random==0){
			return true;
		}
		else{
			return false;
		}
	}

}
