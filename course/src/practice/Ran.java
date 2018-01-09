package practice;

public class Ran {

	public static void main(String[] args) {
		int[] a = new int[10];
		for(int i = 0;i < 10; i++){
			int x = (int)(50+Math.random()*(100-50+1));
			a[i] = x;
			System.out.print(a[i] + " ");
		}

	}

}
