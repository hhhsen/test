package test3.b;

public class E {
	public static void main(String[] args){
		A x = new B();
		x.a =1.1;
		System.out.print(x.a + " ");
		x.a();
		B y = new B();
		y.a = 1;
		System.out.print(y.a + " ");
		y.b = 2;
		System.out.println(y.b);
		y.a();
		y.b();
	}
}
