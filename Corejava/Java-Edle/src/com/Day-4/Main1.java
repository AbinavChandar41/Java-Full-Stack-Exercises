package com.abinav2;

class Animal1{
	int a=10;
	void move() {
		System.out.println("All animals move from one place to another place");
	}
	void eat() {
		System.out.println("All animals eat something");
	}
}

class Dog1 extends Animal1{
	int a=20;
	void move() {
		System.out.println("Dog will move by walk");
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}



public class Main1 {
	public static void main(String args[]) {
		Animal1 animal;
		animal=new Dog1(); //DMD
		animal.move();
		animal.eat();
		
		System.out.println(animal.a);
		
		
		
	}

}