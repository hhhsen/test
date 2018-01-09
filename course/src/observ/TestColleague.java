package observ;

public class TestColleague {

	public static void main(String[] args) {
		Wang w = new Wang();
		Colleague c1 = new Colleague("张三");
		Colleague c2 = new Colleague("李四");
		Colleague c3 = new Colleague("王五");
		w.addObserver(c3);
		w.addObserver(c2);
		w.addObserver(c1);
		w.changeA(true);
		w.deleteObserver(c1);
		w.changeA(false);
		
	}

}
