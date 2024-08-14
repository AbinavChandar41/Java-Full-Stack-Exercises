package com.abinav1;

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



public class Main2 {
	public static void main(String args[]) {
		Bike bike = new Bike();
		bike.noOfWheels();
		bike.brandName();
		
			}

}
