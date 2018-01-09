package inherit;

public class Cylinder extends Circle{
	private double length;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	Cylinder()
	{
		length = 1;
	}
	public double findVolume()
	{
		
		double v = findArea() * length;
		return v;		
	}
	public double findArea()
	{
		double s = 3.14 *getRadius() *getRadius();
		return s;
		
	}

}
