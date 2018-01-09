package test1;

public class Test7a {

	public static void main(String[] args) {
		int q = 4;
		int[][]a = new int[q][];
		for(int i = 0;i<q;i++){
			a[i] = new int[i+1];
			for(int j = 0;j<=i;j++){
				if(i==0 ){
					a[i][j]=1;
				}else{
					int x = 0;
					if(j>=1){
					x += a[i-1][j-1];
					}
					if(j<i){
					x += a[i-1][j];
					}
					a[i][j] = x;
				}
			}
		}	
		for(int i = 0;i<q;i++){
			for(int l = i;l<q;l++){
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
