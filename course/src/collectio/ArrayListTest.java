package collectio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("winsun");
		a1.add("weixin");
		a1.add("mybole");
		for(int i = 0;i<a1.size();i++){
			System.out.println(a1.get(i));
		}
		System.out.println(a1);
		Object[]a=a1.toArray();
		for(int i = 0;i<a1.size();i++){
			System.out.println(a[i]);
		}
		List a2=Arrays.asList(a);
		System.out.println(a2);
	}

}
