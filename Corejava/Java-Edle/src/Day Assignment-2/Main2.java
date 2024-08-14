package Assignment1;

class Shape{
	double getArea() {
		System.out.println("calculating area of the shape");
		return 0;
	}
}
class Rectangle extends Shape{
	private double width;
	private double height;
	
	Rectangle(double width, double height){
		this.width=width;
		this.height=height;
		
		
	}
	double getArea() {
		return width*height;
	}
}
public class Main2 {
	public static void main(String args[]) {
		Shape shape = new Shape();
		System.out.println("Area of shape "+ shape.getArea());
		
		
		Rectangle rec = new Rectangle(5,6);
		System.out.println("Area of rectangle "+rec.getArea());
	}

}
