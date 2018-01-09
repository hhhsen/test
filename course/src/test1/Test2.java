package test1;

public class Test2 {

	public static void main(String[] args) {
		int a =10;
		if(a>=0 && a<=100){
			if(a>=90){
				System.out.println("A");
			}else if(a>=80){
				System.out.println("B");
			}else if(a>=70){
				System.out.println("C");
			}else if(a>=60){
				System.out.println("D");
			}else{
				System.out.println("E");
			}
			}else{
				System.out.println("请使用百分制的分数");
		}
	}

}
