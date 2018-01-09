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
			case "��������":
				money = 600 * days;
				System.out.println("��������յķ���Ϊ��" + money);
				break;
			case "����":
				money = 500 * days;
				System.out.println("�ⱦ��ķ���Ϊ��" + money);
				break;
			case "���":
				money = 300 * days;
				System.out.println("���˵ķ���Ϊ��" + money);
				break;
			
		}
		return money;		
	}
}
