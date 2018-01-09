package test1;

public class Test5 {

	public static void main(String[] args) {
		int n = 6;
		
		long []f =new long[90];
		
		for(int i=0;i<f.length;i++){
			if(i==0 || i==1){
				f[i] = 1;
			}else{
				f[i] = f[i-1] + f[i-2];
			}
		}
		System.out.println(f[n]);
		
	}
}
