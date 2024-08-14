package Assignment3;

class Animall{
	void move() {
		System.out.println("all animals can move");
	}
	void sound() {
		System.out.println("all animals can make sound");
	}
}
class Bird extends Animall{
	void move() {
		System.out.println("birds can fly ");
	}
	void sound() {
		System.out.println("birds can make a sound like a song");
	}
}
class Panthera extends Bird{
	void move() {
		System.out.println("pantera can walk");
	}
	void sound() {
		System.out.println("panthera can make a sound like a roar");
	}
}
public class Assignment4 {
	public static void main(String args[]) {
		Animall ani = new Animall();
		ani.move();
		ani.sound();
		
		Bird bird = new Bird();
		bird.move();
		bird.sound();
		
		Panthera pan = new Panthera();
		pan.move();
		pan.sound();
	}

}
