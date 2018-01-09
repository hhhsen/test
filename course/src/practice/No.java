package practice;
import java.util.Arrays;


public class No {

	public static void main(String[] args) {
		int[] a = new int[]{42,99,5,63,95,36,2,69,200,96};
		String[] b = new String[10];
		Arrays.sort(a);
		
		for(int i = 0;i < a.length;i++){
			b[i] = Integer.toString(a[i]);
	            System.out.print(b[i]+",");
	    }
	}

}
