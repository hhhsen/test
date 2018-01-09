package test4.a3;

public class Test {
	public void makeFly(CanFly c){
		c.fly();
	}
	public static void main(String[] args) {
		Test t = new Test();
		CanFly a = new Air();
		CanFly b = new Bird();
		t.makeFly(a);
		t.makeFly(b);
	}

}
