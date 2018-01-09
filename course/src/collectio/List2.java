package collectio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List2 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		for(int i = 0;i<10;i++){
			l.add(i);
		}
		List<Integer> li = new ArrayList<>();
		li.addAll(l);
		System.out.println("是否包含5："+li.contains(5));
		System.out.println("查找5的位置:"+li.indexOf(5));
		System.out.println("查找5的位置:"+Collections.binarySearch(li, 5));
		System.out.println("返回第5个元素："+l.get(5));
		li.remove(5);							//删除第5个元素
		Collections.sort(l);                    //排序列表
		Collections.swap(li, 0, 1);             //交换指定位置
		ListIterator<Integer> iter = li.listIterator();
		while(iter.hasNext()){					//从前向后输出
			System.out.print(iter.next() + " "); 
		}System.out.println();
		while(iter.hasPrevious()){				//从后向前输出
			System.out.print(iter.previous()+" ");
		}
		/*LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		//先进先出FIFO输出
		for(int i = 0;i<=list.size()+1;i++){
			System.out.println(list.poll());
		}
		System.out.println("剩余："+list);*/
	}

}
