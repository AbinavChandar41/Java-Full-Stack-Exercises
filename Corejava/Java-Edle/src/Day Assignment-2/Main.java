package Assignment1;

class Animal{
	void Makesound() {
		System.out.println("animal makes the sound");
		
	}
}
class Cat extends Animal{
	void Makesound() {
		System.out.println("cat makes the sound");
	}
}





public class Main {
	public static void main(String args[]) {
		Animal ani = new Animal();
		ani.Makesound();
		
		Cat cat = new Cat();
		cat.Makesound();
	}

}
