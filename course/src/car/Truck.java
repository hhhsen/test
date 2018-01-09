package car;

public class Truck extends MotoVehile{
	final int weight;
	public Truck(String no,String brand,int weight){
		super(no,brand);
		this.weight = weight;
	}
	public String toString(){		
		return getNo() + getBrand() +  weight ;		
	}

	@Override
	public int calcRent(int days) {
		int money;
		money = weight * days * 50;
		System.out.println("租卡车的费用为：" + money);
		return money;
	}
	

}
