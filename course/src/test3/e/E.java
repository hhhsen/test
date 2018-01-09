package test3.e;

public class E {

	public static void main(String[] args) {
		Aodi a = new Aodi();
		Benchi b = new Benchi();
		a.price = 11;
		a.type ="AODi";
		b.price = 12;
		b.type = "BENchi";
		a.drive();
		b.drive();
	}

}
