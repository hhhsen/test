package io;

import java.io.*;

public class Test {

	public static void main(String[] args) {
		String path = "C:\\windows";
		File f = new File(path);
		File fi[] = f.listFiles();
		for(int i = 0;i<fi.length;i++){
			File fil = fi[i];
			if(fil.getAbsolutePath().endsWith(".ini")){
				System.out.println();
				System.out.println(fil.getName());
				InputStream input = null;
				try {
					input = new FileInputStream(fil);
					int temp = input.read();
					while(temp != -1){
						System.out.print((char)temp);
						temp = input.read();
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					if(input != null){
						try {
							input.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
