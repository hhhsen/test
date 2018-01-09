package clonee;

import java.util.Arrays;

public class TestComparee {

	public static void main(String[] args) {
		Comparee c[] = {new Comparee(9,1),new Comparee(2,3),new Comparee(2,5)};
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
		Comparee2 cc[] = {new Comparee2(9,1),new Comparee2(2,3),new Comparee2(2,5)};
		System.out.println(Arrays.toString(cc));
		Arrays.sort(cc,new Comparee21());
		System.out.println(Arrays.toString(cc));
	}

}
