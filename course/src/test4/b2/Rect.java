package test4.b2;

public class Rect {
	protected int width;
	protected int height;
	Rect(int width,int height){
		this.width = width;
		this.height = height;
	}
	Rect(){
		width = 10;
		height = 10;
	}
	public int area(){
		return width * height;
	}
	public int perimeter(){
		return (width + height) * 2;
	}
}
