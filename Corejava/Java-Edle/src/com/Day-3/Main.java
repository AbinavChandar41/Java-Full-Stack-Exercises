package com.abinav1;

class Vehicle {
	void noOfEngine() {
		System.out.println("i have one engine");
	}
}
class TwoWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("i have two wheels");
	}
}

class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("brand name is honda");
	}
}
class Scooty extends TwoWheeler{
	void brandName() {
		System.out.println("brand name is activa");
	}
}

public class Main {
	public static void main(String args[]) {
		Bike bike = new Bike();
		bike.noOfWheels();
		bike.brandName();
		bike.noOfEngine();
		
		Scooty scooty = new Scooty();
		scooty.noOfWheels();
		scooty.brandName();
		scooty.noOfEngine();
	}

}
