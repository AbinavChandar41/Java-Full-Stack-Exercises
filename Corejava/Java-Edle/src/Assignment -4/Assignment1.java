package Assignment3;

class Animal{
	void sound() {
		System.out.println("All animals makes the sound");
	}
}
class BabyBird extends Animal{
	void sound() {
		System.out.println("bird makes the sound like the song");
	}
}
class Cat extends BabyBird{
	void sound() {
		System.out.println("cat makes the sound like meow");
	}
}
public class Assignment1 {
	public static void main(String args[]) {
		Animal ani = new Animal();
		ani.sound();
		BabyBird bird = new BabyBird();
		bird.sound();
		Cat cat = new Cat();
		cat.sound();
	}

}
