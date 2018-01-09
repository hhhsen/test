package school;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class School {
	public static void main(String[] args){
		Student s = new Student();
		Map<Integer,List> map = new HashMap<>();
		map.put(0,s.list);
		map.put(1,s.list1);
		map.put(2,s.list2);
		Set<Integer>keySet = map.keySet();
		for(int i:keySet){
			System.out.println("学校："+i+"==>学生："+map.get(i));
		}
	}
}
