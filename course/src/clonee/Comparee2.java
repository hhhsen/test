package clonee;

public class Comparee2 {
	private int a;
	private int b;
	private int c;
	public Comparee2(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		this.c = a + b;
	}
	
	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

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
	public String toString(){
		return this.a + "," + this.b;
	}
}
