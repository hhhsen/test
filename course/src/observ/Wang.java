package observ;

import java.util.Observable;

public class Wang extends Observable{
	private String name;
	private boolean a;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getA(){
		return a;
	}
	public Wang(String name) {
		super();
		this.name = name;
	}
	public Wang(){}
	public void changeA(boolean a){
		this.a = a;
		//老板回来
		this.setChanged();
		//通知同事
		this.notifyObservers(this.a);
	}
	public void getMassage(){
		System.out.println(this.getName()+"收到了回复");
	}
}
