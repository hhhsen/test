package check;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class Clock extends TimerTask{

	@Override
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:dd:ss");
		System.out.println("当前时间"+sdf.format(new Date()));
		
	}

}
