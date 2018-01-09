package test2;

public class MyMath {
	public double mul(double a){
		double aa = a*a;
		return aa;
	}
	public int mul(int a){
		int aa = a*a*a;
		return aa;
	}
	public int mul(double a,int b){
		int aa = (int) Math.pow(a, b);
		return aa;
	}

	public static void main(String[] args) {
		MyMath x = new MyMath();
		System.out.println(x.mul(10, 4));

	}

}
