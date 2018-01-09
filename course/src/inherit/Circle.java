package inherit;

public class Circle {
	private double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	Circle()
	{
		radius = 1;		
	}
	public double findArea()
	{
		double s = 3.14 * radius * radius;
		return s;
		
	}

}
