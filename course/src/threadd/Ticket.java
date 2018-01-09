package threadd;

public class Ticket implements Runnable {
	private int tickeCount = 10;
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(this){
				if(tickeCount<=0){
					break;
				}
				System.out.println("票号："+ tickeCount--);
			}
			/*boolean flag = sell();
			if(flag){
				break;
			}*/
		}

	}
	/*private synchronized boolean sell() {
		if(tickeCount<=0){
			return true;
		}
		System.out.println("票号："+ tickeCount--);
		return false;
	}*/
	public static void main(String[] args){
		Ticket t = new Ticket();
		Ticket tt = new Ticket();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(tt);
		t1.start();
		t2.start();
	}
}
