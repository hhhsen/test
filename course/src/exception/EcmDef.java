package exception;

public class EcmDef {
	
	public void ecm(int x,int y)  {	
		
		if(x<0 || y<0){						
		try {
			throw new EcDef("不能为负数");
		} catch (EcDef e) {
			System.out.println(e.toString());
		}			
		}
		 int c = x / y;
		 System.out.println(c);
	}

	public static void main(String[] args){
		int [] a = new int []{1,0,-1};			
		EcmDef x = new EcmDef();
		try {
		x.ecm(a[2], a[1]);		
		} catch (ArithmeticException e) {
			System.out.println(e.toString()+"分母不能为0");
		}
		
	}

}
