package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) {
		File file = new File("D://2.bin");
		OutputStream output = null;
		ObjectOutputStream objOutput = null;
		try {
			output = new FileOutputStream(file);
			objOutput = new ObjectOutputStream(output);
			Person p = new Person("张三",20);
			objOutput.writeObject(p);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(objOutput != null){
					objOutput.close();
				}if(output != null){
					output.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
