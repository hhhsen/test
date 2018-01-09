package test1;

public class Test4 {

	public static void main(String[] args) {
		for(int a = 100;a < 1000;a++){
			int x = a % 10;
			int y = a / 10 % 10;
			int z = a / 100 % 10;
			int sum = x*x*x + y*y*y + z*z*z;
			if(a == sum){
				System.out.println(a);
			}
		}

	}

}
