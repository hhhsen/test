package car;

public class Bus extends MotoVehile{
	final int seatCount;
	
	public Bus(String no ,String brand,int seatCount){		
		super(no,brand);
		this.seatCount = seatCount;
	}
	public String toString(){		
		return getNo() + getBrand() + seatCount;		
	}
	
	@Override
	public int calcRent(int days) {
		int money;
		if(seatCount > 16){
			money = 1500 * days;
			System.out.println("���͵ķ���Ϊ��" + money);
		}else{
			money = 800 * days;
			System.out.println("���͵ķ���Ϊ��" + money);
		}
		return money;		
	}
}
