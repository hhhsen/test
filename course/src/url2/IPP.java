package url2;

import java.io.IOException;
import java.net.InetAddress;


public class IPP {
	public static void main(String[] args){
		try {
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println("本机地址："+addr.getHostAddress());
			//实例化IP地址
			InetAddress addr2 = InetAddress.getByName("192.168.5.2");
			System.out.println("本机地址："+addr2.getHostAddress());
		} catch ( IOException e) {
			e.printStackTrace();
		}
	}
}
