package Assignment3;

class Sport{
	void play() {
		System.out.println("sports are the main thing to stay healthy now see some sports");
	}
}
class Football extends Sport{
	void play() {
		System.out.println("Foot ball is the main sport in europian countries");
	}
}
class Basketball extends Football{
	void play() {
		System.out.println("basket ball is the important sport in the america");
	}
	
}
class Rugby extends Basketball{
	void play() {
		System.out.println("pass the ball tackle the oppenent");
	}
}
public class Assignment3 {
	public static void main(String args[]) {
		Rugby spo = new Rugby();
		spo.play();
		
		Football foot = new Football();
		foot.play();
		
		Basketball ball = new Basketball();
		ball.play();
		
		
	}

}
