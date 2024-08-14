package Assignment;

class Rectangle{
	private double width;
	private double height;
	
	Rectangle(double width,double height){
		this.width=width;
		this.height=height;
		
	}
	double getwidth() {
		return width;
	}
	double getheight() {
		return height;
		
	}
	double calculatewidth() {
		return width*height;
	}
	double calculateheight() {
		return 2 * (width+height);
	}
}


public class Assign3 {
	public static void main(String args[]) {
		Rectangle rec = new Rectangle(5.0,3.0);
		double wid = rec.getwidth();
		double hei = rec.getheight();
		
		double area=rec.calculatewidth();
		double perimeter=rec.calculateheight();
		
		System.out.println("given widht "+wid);
		System.out.println("given height "+hei);
		System.out.println("given area "+area);
		System.out.println("given perimeter "+perimeter);
		
		
		
		
	}
	

}
