package com.abinav2;

class Animal2{
	String msg = getMessage();
	String getMessage() {
		return "A";
	}
}

class Dog2 extends Animal2{
	int a=20;
	String getMessage() {
		return "B";
	}
}


public class Main4 {
	public static void main(String args[]) {
		Animal2 animal = new Dog2();
		System.out.println(animal.msg);
		
		
	}

}