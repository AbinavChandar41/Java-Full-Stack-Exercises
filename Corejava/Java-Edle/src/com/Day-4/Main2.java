package com.abinav2;
//dynamic method dispatch

class Animal{
	void move() {
		System.out.println("All animals move from one place to another place");
	}
	void eat() {
		System.out.println("All animals eat something");
	}
}

class Dog extends Animal{
	void move() {
		System.out.println("Dog will move by walk");
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}

class Bird extends Dog{
	void move() {
		System.out.println("bird will move by fly");
	}
	void eat() {
		System.out.println("bird will eat nuts");
	}
}

class Fish extends Bird{
	void move() {
		System.out.println("fish will move by swim");
	}
	void eat() {
		System.out.println("fish will eat small fish");
	}
}

public class Main2 {
	public static void main(String args[]) {
		Animal animal;
		animal=new Dog();
		animal.move();
		animal.eat();
		
		
		animal = new Bird();
		animal.move();
		animal.eat();
		
		animal = new Fish();
		animal.move();
		animal.eat();
	}

}
