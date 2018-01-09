package practice;

public class Vehicle {
	private int speed;
	int size;
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void move(int speed,int size){
		this.setSpeed(speed);
		this.setSize(size);
	};
	public void speedUp(int speedUp){
		this.setSpeed(speed + speedUp);
	};
	public void speedDown(int speedDown){
		this.setSpeed(speed - speedDown);
	};

	public static void main(String[] args) {
		Vehicle a = new Vehicle();
		a.move(60,30);
		System.out.println(a.getSpeed() + " " + a.getSize());
		a.speedUp(30);
		System.out.println(a.getSpeed() + " " + a.getSize());
		a.speedDown(10);
		System.out.println(a.getSpeed() + " " + a.getSize());

	}

}
