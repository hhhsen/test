package str;


public class Str {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("空闲内存："+rt.freeMemory());
		System.out.println("最大内存："+rt.maxMemory());
		rt.gc();
		
		//字符串相加
		String str[] = {"我们","一起","学习","Java"};
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<str.length;i++)
		{
			sb =sb.append(str[i]);
		}
		System.out.println(sb);
		System.out.println("字符串长度:"+sb.length());
		System.out.println("字符串的位置:"+sb.indexOf("一"));
		System.out.println("截取字符串:"+sb.substring(2, 4));
		System.out.println("替换字符串:"+sb.replace(2, 3, "二"));
		System.out.println("删除字符串:"+sb.delete(2, 3));
		System.out.println("插入字符串:"+sb.insert(2, "一"));
	}

}
