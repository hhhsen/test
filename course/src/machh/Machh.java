package machh;

import java.math.BigDecimal;
import java.util.Random;

public class Machh {

	public static void main(String[] args) {
		System.out.println("2的100次方："+ Math.pow(2,100));
		System.out.println("25的平方根： "+ Math.sqrt(25));
		System.out.println("10/3="+new BigDecimal("10").divide(new BigDecimal("3"),2,BigDecimal.ROUND_HALF_UP));
		
		Random r = new Random();
		for(int i=0;i<=10;i++){
			int a = r.nextInt(100);
			if(a%10==9){
				System.out.println(a+"为幸运号码");
			}else{
				System.out.println(a);
			}
		}
	}

}
 