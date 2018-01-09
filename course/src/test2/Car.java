package test2;

public class Car {
	private String no;
	private int speed;
	private double weight;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Car(){
		no = "XX1234";
		speed = 100;
		weight = 100;
	}
	public Car(String no,int speed,double weight){
		this.no = no;
		this.speed = speed;
		this.weight = weight;
	}
	public int speedUp(int a){
		speed = speed + a;
		return speed;
	}
	public int speedDown(int a){
		speed = speed - a;
		return speed;
	}

	public static void main(String[] args) {
		Car a = new Car();
		a.setNo("辽A9572");
		a.speedUp(20);
		System.out.println(a.getNo()+" "+a.getSpeed()+" "+a.getWeight());
		Car b = new Car("辽B5086",150,200);
		System.out.println(b.getNo()+" "+b.getSpeed()+" "+b.getWeight());
	}

}
