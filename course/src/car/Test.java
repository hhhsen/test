package car;
import java.io.*;
public class Test {
	
	
	public static void main(String[] args) throws IOException  {
		MotoVehile[] moto =new MotoVehile[5];
		moto[0] = new Car("��NY28588","550i","����");
		moto[1] = new Car("��NY323","550i","����");
		moto[2] = new Car("��NY28588","������","���");
		moto[3] = new Bus("����","4",34);	
		moto[4] = new Truck("��NY1355","6",15);
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("������������");
	String str = br.readLine();		
	int days = Integer.valueOf(str);
	
	
	int cost = 0;
		for(int i = 0; i < moto.length;i++)	{
			cost += moto[i].calcRent(days);
		}
		System.out.println("�ܷ��ã�" + cost);
	}
}
