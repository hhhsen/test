package enum1;

public class TestColor {

	public static void main(String[] args) {
		/*showColor(Colors.BLUE);
		showColor(Colors.RED);*/
		//取出一个枚举值
		Colors c = Colors.BLUE;
		
		//System.out.println(c);
		//列出枚举类的所有值
		Colors[] c1 = Colors.values();
		/*for(Colors co:c1){
			System.out.println(co);
		}*/
		System.out.println("返回枚举的常量名称："+c.name());
		System.out.println("返回枚举常量序数："+c.ordinal());
	}
	private static void showColor(Colors colors) {
		switch(colors){
		case BLUE:
			System.out.println("蓝色");
			break;
		case GREEN:
			System.out.println("绿色");
			break;
		case RED:
			System.out.println("红色");
			break;
		default:
			System.out.println("未知颜色");
		}
	}

	

}
