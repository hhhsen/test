package inherit;

public class TestCylinder {

	public static void main(String[] args) {
		Cylinder a = new Cylinder();
		a.setRadius(5);
		a.setLength(10);
		System.out.println(a.findArea());
		System.out.println(a.findVolume());

	}

}
