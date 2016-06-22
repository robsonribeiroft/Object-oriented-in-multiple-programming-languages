package ring;

public class Circle {
	
	double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getArea(double radius){
		return Math.PI * Math.pow(radius, 2);
	}
}
