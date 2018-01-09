package clonee;

import java.util.Arrays;
import java.util.Comparator;

public class Comparee21 implements Comparator<Comparee2>{

	@Override
	public int compare(Comparee2 o1, Comparee2 o2) {
		if(o1.getC()>o2.getC()){
			return -1;
		}else if(o1.getC()==o2.getC()){
			return 0;
		}else{
			return 1;
		}
	}
	public static void main(String[] args) {
		Comparee2 cc[] = {new Comparee2(9,1),new Comparee2(2,3),new Comparee2(2,5)};
		System.out.println(Arrays.toString(cc));
		Arrays.sort(cc,new Comparee21());
		System.out.println(Arrays.toString(cc));
	
	}

}
