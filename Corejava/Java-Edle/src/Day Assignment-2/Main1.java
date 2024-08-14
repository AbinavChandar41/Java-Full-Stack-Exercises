package Assignment1;
class Vehicle{
	void drive() {
		System.out.println("vechicle is driving");
	}
}
class Car extends Vehicle {
	void drive() {
		System.out.println("Repairing a car");
	}
	
}
public class Main1 {
	public static void main(String args[]) {
		Vehicle vec = new Vehicle();
		vec.drive();
		
		Car car = new Car();
		car.drive();
	}

}
