package test4.b2;

public class Test {

	public static void main(String[] args) {
		PlainRect p= new PlainRect(10,10,20,10);
		System.out.println("面积：" + p.area());
		System.out.println("周长：" + p.perimeter());
		System.out.println(p.isInside(25.5, 13));
	}
	

}
