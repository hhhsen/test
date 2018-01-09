package school;

import java.util.ArrayList;
import java.util.List;

public class Student {
	List<String> list = new ArrayList<String>();
	List<String> list1 = new ArrayList<String>();
	List<String> list2 = new ArrayList<String>();
	Student(){
		for(int i  = 0;i<=10;i++){
			list.add("张"+i);
		}
		for(int i  = 0;i<=10;i++){
			list1.add("李"+i);
		}
		for(int i  = 0;i<=10;i++){
			list2.add("王"+i);
		}
		
	}
}
