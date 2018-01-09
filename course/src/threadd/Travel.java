package threadd;

import java.util.Random;

public class Travel extends Thread{
	private String name;
	private long s;
	
	public Travel(String name) {
		super();
		this.name = name;
	}
	public long getS() {
		return s;
	}

	public void run() {
		long ss = System.currentTimeMillis();
		for(int i = 1;i<=10;i++){
			System.out.println(name);
			try {
				Random r = new Random();
				Thread.sleep(r.nextInt(100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		s = System.currentTimeMillis()-ss;
		System.out.println(name+"耗费时间："+s);
	}
	
}
