package test4.b3;

public class Test {
	
	public static void useInter(InterfaceA a,int n){
		System.out.println("结果为" + a.method(n));
	}
	
	public static void main(String[] args) {
		InterfaceA a;
		a = new ClassA();
		System.out.println("结果为" + a.method(3));
		a = new ClassB();
		System.out.println("结果为" + a.method(4));
		
		useInter(new ClassA(), 3);
		useInter(new ClassB(), 4);
	}

}
