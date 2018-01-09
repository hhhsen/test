package agency;

public class TestMy {

	public static void main(String[] args) {
		My my = new My();
		Subject s = (Subject) my.createProxy(new China());
		
		s.say("张三");
		Subject s2 = (Subject) my.createProxy(new America());
		s2.say("zhangsan");
	}

}
