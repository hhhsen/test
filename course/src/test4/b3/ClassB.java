package test4.b3;

public class ClassB implements InterfaceA{

	@Override
	public int method(int n) {
		if(n>0){
			int s = 1;
			for(int i = 0;i<n;i++){
			s= s *(i+1);
			}
			return s;
		}else if(n == 0){
			return 1;
		}else {
			return 0;
		}
	}
}
