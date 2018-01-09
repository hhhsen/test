package threadd;

public class TestTravel {

	public static void main(String[] args) {
		/*Travel t1 = new Travel("广州");
		Travel t2 = new Travel("深圳");
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(1000);
			//t1.yield();			//将t1的操作暂时让给其他线程执行
			//t1.setPriority(1);    //设置t1优先级：1最低，5默认，10最高
			//t1.join();            //强制运行线程t1
			//t1.interrupt();       //中断线程t1的运行状态
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(t1.getS()>t2.getS()){
			System.out.println("决定去深圳");
		}else{
			System.out.println("决定去广州");
		}*/
		
		
		
		Travel2 t1 = new Travel2("广州");
		Travel2 t2 = new Travel2("深圳");
		Thread t3 = new Thread(t1);
		Thread t4 = new Thread(t2);
		System.out.println("线程t3是否启动："+t3.isAlive());
		t3.start();
		t4.start();
		System.out.println("线程t3是否启动："+t3.isAlive());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(t1.getS()>t2.getS()){
			System.out.println("决定去深圳");
		}else{
			System.out.println("决定去广州");
		}
		
		
	}

}
