package genericity;

public class Add<T,F> {
	private T a;
	private F b;
	
	public Add(T a, F b) {
		super();
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public F getB() {
		return b;
	}

	public void setB(F b) {
		this.b = b;
	}
	public void show(){
		System.out.println("a:"+a+"   b:"+b);
	}

	public static void main(String[] args) {
		Add<Integer,Double> add = new Add<>(10,10.2);
		add.show();
		Add<Double,String> add1 = new Add<>(10.2,"aaa");
		add1.show();
		Add<String,Integer> add2 = new Add<>("aaa",10);
		add2.show();
	}

}
