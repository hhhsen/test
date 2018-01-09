package datee;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Datee {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("获取系统日期和时间：" + sdf.format(new Date()));
		
		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		c.add(Calendar.DATE, -5);
		System.out.println("5天前的时间:"+sdf.format(c.getTime()));
		System.out.println("系统时间"+sdf.format(c1.getTime()));
		System.out.println("两个日期相隔的天数："+(c1.get(Calendar.DATE)-c.get(Calendar.DATE)));
		System.out.println("今天是"+ (c1.get(Calendar.MONTH)+1) +"月,周"+ (c1.get(Calendar.DAY_OF_WEEK)-1));
		c.set(Calendar.MONTH, 11);  //设置月份，0到11
		c.set(Calendar.MINUTE, 0);  //设置分钟
		System.out.println("设置好的系统日期和时间：" + sdf.format(c.getTime()));
		
		c1.set(2017, 5, 20, 18, 20, 20);
		sdf = new SimpleDateFormat("yyyy年M月d日  HH时mm分ss秒");
		System.out.println(sdf.format(c1.getTime()));
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(c1.getTime()));
		sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		System.out.println(sdf.format(c1.getTime()));
		sdf = new SimpleDateFormat("yyyy-MM");
		System.out.println(sdf.format(c1.getTime()));
		sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(c1.getTime()));
	}

}
