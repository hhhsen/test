package test4.a2;

public class Test {
	public static void main(String[] args){
		UseCompute u = new UseCompute();
		Compute jia = new Jia();
		u.useCom(jia, 3, 3);
		Compute jian = new Jian();
		u.useCom(jian, 3, 3);
		Compute chen = new Chen();
		u.useCom(chen, 3, 3);
		Compute chu = new Chu();
		u.useCom(chu, 3, 3);
	}
}
