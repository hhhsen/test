package car;
import java.io.*;
public class Test {
	
	
	public static void main(String[] args) throws IOException  {
		MotoVehile[] moto =new MotoVehile[5];
		moto[0] = new Car("京NY28588","550i","宝马");
		moto[1] = new Car("京NY323","550i","宝马");
		moto[2] = new Car("京NY28588","林荫大道","别克");
		moto[3] = new Bus("金龙","4",34);	
		moto[4] = new Truck("京NY1355","6",15);
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("请输入天数：");
	String str = br.readLine();		
	int days = Integer.valueOf(str);
	
	
	int cost = 0;
		for(int i = 0; i < moto.length;i++)	{
			cost += moto[i].calcRent(days);
		}
		System.out.println("总费用：" + cost);
	}
}
