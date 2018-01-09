package check;

import java.util.Timer;

public class Clockk {
	
	public static void main(String[] args) {
		Timer t = new Timer();
		Clock c = new Clock();
		t.schedule(c, 1000,2000);
	}

}
