package test2;

public class Triangle {
	private int a;
	private int b;
	private int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public Triangle(){}
	public Triangle(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int perimeter(){
		int sum = a+b+c;
		return sum;
		}

	public static void main(String[] args) {
		Triangle x =new Triangle(3,4,5);
		System.out.println(x.perimeter());

	}

}
