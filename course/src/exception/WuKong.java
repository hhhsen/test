package exception;

import java.util.Random;

public class WuKong {
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a){
		if(a >= 100){
				try {
			ATooBigException big = new ATooBigException("饱了");
				throw big;
			} catch (ATooBigException e) {
				System.out.println(e.toString());
			}
		}
		this.a = a;
	}
	public static void main(String[] args) {
		WuKong w = new WuKong();
		int b = 0;
		for(int i = 1; i < 100; i++){
		int peach = new Random().nextInt(5);
		System.out.println("桃子:" + peach);
		if(peach == 0){
			System.out.println("烂桃");	
			System.out.println("胃口:" + b);
			try {
				throw new Exce("我的桃");
			} catch (Exce e) {
				System.out.println(e.toString());
			}
		}else if(peach == 1){
			b = b + 1;
			System.out.println("难吃的桃");
			System.out.println("胃口:" + b);
			try {
				throw new NullPointerException("泼猴");
			} catch (NullPointerException e) {
				System.out.println(e.toString());
			}	w.setA(b);		
		}else if(peach == 2){
			b = b + 5;
			System.out.println("普通的桃");
			System.out.println("胃口:" + b);
			try {
			throw new ArithmeticException("猴头");
			} catch (ArithmeticException e) {
			System.out.println(e.toString());
			}	w.setA(b);	
		}else{
			b = b + 10;
			System.out.println("美味的桃");
			System.out.println("胃口:" + b);
			w.setA(b);
		}if(b >= 100){
			
			return;
		}
		}
	}

}
