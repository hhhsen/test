package test1;

public class Test1 {

	public static void main(String[] args) {
		int year = 2400;
		if(year % 4 == 0){
			if(year % 100 != 0){
				System.out.println("是闰年");
			}else if(year % 400 == 0){
				System.out.println("是闰年");
			}
		}else{
			System.out.println("不是闰年");
		}

	}

}
