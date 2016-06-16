package ring;

public class Ring extends Circle {
	
	double internal;
	
	public Ring(double external, double internal){
		super(external);
		this.internal = internal;
	}
	
	public double getRingArea(){
		return this.getArea(this.radius) - this.getArea(internal);
	}
}
