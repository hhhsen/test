package car;

public class Car extends MotoVehile{
	final String type;
	
	public Car(String no,String brand,String type) {
		super(no,brand);
		this.type = type;
	}
	public String toString(){
		
		return getNo() + getBrand() + type;		
	}
	
	@Override
	public int calcRent(int days) {
		int money = 0;
		switch(type){
			case "别克商务舱":
				money = 600 * days;
				System.out.println("租别克商务舱的费用为：" + money);
				break;
			case "宝马":
				money = 500 * days;
				System.out.println("租宝马的费用为：" + money);
				break;
			case "别克":
				money = 300 * days;
				System.out.println("租别克的费用为：" + money);
				break;
			
		}
		return money;		
	}
}
