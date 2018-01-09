package io;

import java.io.*;

public class Test1 {

	public static void main(String[] args) {
		String path = "D:\\qq.html";
		File f = new File(path);
		try {
			Reader read = new FileReader(f);
			BufferedReader buff = new BufferedReader(read);
			String txt = null;
			while((txt = buff.readLine()) != null){
				System.out.println(txt);
			}
			read.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
