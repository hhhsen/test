package test4.b3;

public class ClassA implements InterfaceA{

	@Override
	public int method(int n) {
		int s = 0;
		for(int i = 1;i<=n;i++){
			s = s + i;
		}
		return s;
	}

}
