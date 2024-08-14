package Assignment1;

class Animall{
	void move() {
		System.out.println("animal is running");
	}
}
class Cheetah extends Animal{
	void move() {
		System.out.println("cheetah is running");
	}
}
public class Main4 {
	public static void main(String args[]) {
		Animall ani = new Animall();
		ani.move();
		
		Cheetah chit = new Cheetah();
		chit.move();
	}

}


