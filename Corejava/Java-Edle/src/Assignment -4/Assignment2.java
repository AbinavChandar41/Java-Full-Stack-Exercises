package Assignment3;

class Vehicle{
	protected int speed;
	
	void speedup() {
		speed+=5;
		System.out.println("speed was increased by 5km");
	}
	
}

class Car extends Vehicle{
	void speedup() {
		speed=+10;
		System.out.println("speed was increased by 10km");
	}
}
class Bicycle extends Car{
	void speedup() {
		speed=+3;
		System.out.println("speed was increased by 3km");
	}
}
public class Assignment2 {
	public static void main(String args[]) {
		Vehicle veh = new Vehicle();
		veh.speedup();
		System.out.println("speed of the vehicle is "+veh.speed);
		
		Car car = new Car();
		car.speedup();
		System.out.println("speed of the vehicle is "+car.speed);
		
		Bicycle bi = new Bicycle();
		bi.speedup();
		System.out.println("speed of the vehicle is "+bi.speed);
	}

}
