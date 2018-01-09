package test4.b2;

public class PlainRect extends Rect{
	int startX;
	int startY;
	PlainRect(int width,int height,int startX,int startY){
		super(width,height);
		this.startX = startX;
		this.startY = startY;
	}
	PlainRect(){
		startX = 0;
		startY = 0;
	}
	public boolean isInside(double x,double y){
		if(x>=startX && x<=(startX+width) && y<startY && y>=(startY-height)){
			return true;
		}else{
			return false;
		}
	}
}
