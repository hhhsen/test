package str;

public class Syste {

	public static void main(String[] args) {
		//显示系统所有的属性
		System.getProperties().list(System.out);
		System.out.println("系统版本："+System.getProperty("os.name"));
		System.out.println("当前用户："+System.getProperty("user.name"));
		System.out.println("工作目录："+System.getProperty("user.dir"));
		
		//计算1到1000000相加的结果，并显示计算所花的时间
		long s = 0;
		long start = System.currentTimeMillis();
		for(int i = 0;i<1000000;i++){
			s += i;
		}
		//休眠一秒再继续
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("结果为："+s+" 运行时间:"+(System.currentTimeMillis()-start));
		
		//复制数组
		int a[] = {1,7,9,98,23};
		int b[] = new int[5];
		//原数组a，a[0]开始，目标数组b，b[0]开始，复制5个
		System.arraycopy(a, 0, b, 0, 5);
		for(int i:b){
			System.out.print(i+" ");
		}
		System.out.println();
		
		int c[] = a.clone();
		a[0]=2;
		for(int i:c){
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i:a){
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
