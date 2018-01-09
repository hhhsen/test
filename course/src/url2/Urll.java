package url2;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;


public class Urll {
	
	public static void main(String[] args) {
		try {
			//获取https://www.baidu.com/?tn=99682755_hao_pg这个网站内容
							//协议，主机名称，端口，
			URL url = new URL("http","www.baidu.com",80,"/?tn=99682755_hao_pg");
			InputStream input = url.openStream();
			Scanner scan = new Scanner(input);
			while(scan.hasNext()){
				System.out.println(scan.next());
			}
			/*URLConnection conn = url.openConnection();
			System.out.println("获取内容："+conn.getContent());
			System.out.println("获取内容类型："+conn.getContentType());
			System.out.println("获取内容长度："+conn.getContentLength());*/
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
