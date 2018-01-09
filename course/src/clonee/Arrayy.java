package clonee;

import java.util.Arrays;

public class Arrayy {

	public static void main(String[] args) {
		int a[] = {4,2,6,8,1};
		int a2[] = {4,2,6,8,1};
		int a3[]= a;
		int b[] = {3,5,7,2,8};
		System.out.println("是否指向同一个对象："+(a==a2));
		System.out.println("是否指向同一个对象："+(a==a3));
		System.out.println("比较内容是否相同："+Arrays.equals(a, a2));
		Arrays.sort(b);
		System.out.println("排序后："+Arrays.toString(b));
		System.out.println("查找 8在b[?]: "+Arrays.binarySearch(b, 8));
	}

}
