package Assignment;

class Circle{
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	double getradius() {
		return radius;
		
	}
	void setradius(double radius) {
		this.radius=radius;
	}
	double calculatearea() {
		return Math.PI * radius * radius;
		
	}
	double calculatecircum() {
		return 2 * Math.PI * radius;
		
	}
}




public class Assign4 {
	public static void main(String args[]) {
	Circle cir = new Circle(5.0);
    double rad= cir.getradius();
    double area= cir.calculatearea();
    double circum=cir.calculatecircum();
    System.out.println("the radius is "+rad);
    System.out.println("the area is "+area);
    System.out.println("the circumstance is "+circum);
    
    System.out.println("after updated");
    cir.setradius(6.0);
    rad= cir.getradius();
    area= cir.calculatearea();
    circum=cir.calculatecircum();
    System.out.println("the radius is "+rad);
    System.out.println("the area is "+area);
    System.out.println("the circumstance is "+circum);
    
	}
    
    
    
	

}
