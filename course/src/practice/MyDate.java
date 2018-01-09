package practice;

import org.omg.CORBA.portable.ValueBase;

public class MyDate {
	private int year;
	private int month;
	private int day;
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public MyDate(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String toString(){
		String x = String.valueOf(year);
		String y = String.valueOf(month);
		String z = String.valueOf(day);
		return x + "Äê" + y + "ÔÂ" + z + "ÈÕ";
		}

	public static void main(String[] args) {
		MyDate a = new MyDate(2000,03,20);
		System.out.println(a);

	}

}
