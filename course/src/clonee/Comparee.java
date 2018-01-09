package clonee;

import java.util.Arrays;

public class Comparee implements Comparable<Comparee>{
	private int a;
	private int b;
	private int c;
	public Comparee(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		this.c = a + b;
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
	@Override
	public int compareTo(Comparee o) {
		if(this.c>o.c){
			return -1;
		}else if(this.c==o.c){
			return 0;
		}else{
			return 1;
		}
	}
	public String toString(){
		return this.a + "," + this.b;
	}
	public static void main(String[] args) {
		Comparee c[] = {new Comparee(9,1),new Comparee(2,3),new Comparee(2,5)};
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}
}
