package observ;

import java.util.Observable;
import java.util.Observer;

public class Colleague implements Observer{
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Colleague(String name) {
		super();
		this.name = name;
	}
	public Colleague() {}
	public void update(Observable observable,Object obj){
		if(obj.toString()=="true"){
			System.out.println(name + "知道老板回来了");
			new Wang("王小姐").getMassage();
		}else{
			System.out.println(name + "知道老板走了");
		}
	}
}
