package threadd;

public class Test {
	public static void main(String[] args){
		Ticket t = new Ticket();
		Ticket tt = new Ticket();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(tt);
		t1.start();
		t2.start();
	}
}
