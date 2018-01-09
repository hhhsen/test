package io;

import java.io.*;

public class Test2 {

	public static void main(String[] args) {
		String oldPath = "D:\\a.txt";
		String newPath = "D:\\Test\\a.txt";
		File of = new File(oldPath);
		File nf = new File(newPath);
		if(!of.exists()){
			try {
				of.createNewFile();
				PrintStream ps = new PrintStream(new FileOutputStream(of));
				ps.println("fsdgsfgerergea");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		InputStream ins = null;
		FileOutputStream fs =null;
		int b = 0;
		try {
			ins = new FileInputStream(of); //读入原文件
			fs = new FileOutputStream(nf);
			byte[] buffer = new byte[10];
			while((b = ins.read(buffer)) != -1)
			{
				fs.write(buffer, 0, b);
			}
			ins.close();
			System.out.println("复制成功");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		finally{
			try {
				fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
