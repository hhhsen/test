package test1;

import java.util.Random;

public class Test6 {

	public static void main(String[] args) {
		int a[] = new int[10];
		
		//给数组赋值
		for(int i = 0;i<a.length;i++){
			a[i] = new Random().nextInt(100);
			System.out.print(a[i] + " ");
		}	
		System.out.println();
		
		//最大值
		int max = a[0];
		for(int i = 1;i<a.length;i++){
				if(max<a[i]){
					max = a[i];
				}
		}
		System.out.println("最大值:" +max);
		
		//最小值
		int min = a[0];	
		for(int i = 1;i<a.length;i++){
			if(min>a[i]){
				min = a[i];
			}
		}
		System.out.println("最小值:" +min);
		
		//和
		int sum = a[0];
		for(int i = 1;i<a.length;i++){
			sum = sum + a[i];
		}
		System.out.println("和:" +sum);
		
		//平均值
		double avg =(double) sum/a.length;
		System.out.println("平均值:" +avg);
	}

}
