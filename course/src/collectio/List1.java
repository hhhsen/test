package collectio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List1 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
	     list.add("Hello");
	     list.add("World");
	     list.add("HAHAHAHA");
	    /* //第一种遍历方法使用for遍历List
	     for (String str : list) {            //也可以改写for(int i=0;i<list.size();i++)这种形式
	        System.out.println(str);
	     }
	     
	   //第二种遍历，把链表变为数组相关的内容进行遍历
	     String[] strArray=new String[list.size()];
	     list.toArray(strArray);
	     for(int i=0;i<strArray.length;i++) //这里也可以改写为  for(String str:strArray)这种形式
	     {
	        System.out.println(strArray[i]);
	     }*/
	     
	     System.out.println("是否包含World："+list.contains("World"));
	     System.out.println("查找World的位置:"+list.indexOf("World"));
	     System.out.println("返回第1个元素："+list.get(1));
	     list.remove(1);			//删除第1个元素
	     Collections.sort(list);   //排序列表
	     Collections.swap(list, 0, 1);   //交换指定位置
	   //第三种遍历 使用迭代器进行相关遍历
	     ListIterator<String> iter = list.listIterator();
			while(iter.hasNext()){					//从前向后输出
				System.out.print(iter.next() + " "); 
			}System.out.println();
			while(iter.hasPrevious()){				//从后向前输出
				System.out.print(iter.previous() + " ");
			}System.out.println();
			
		//先进先出FIFO输出
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		for(int i = 0;i<=list1.size()+1;i++){
			System.out.println(list1.poll());
		}
		System.out.println("剩余："+list1);
	}

}
