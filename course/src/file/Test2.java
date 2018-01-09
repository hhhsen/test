package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Test2 {

	public static void main(String[] args) {
		File file = new File("D://2.bin");
		InputStream input = null;
		ObjectInputStream objInput = null;
		try{
			input = new FileInputStream(file);
			objInput = new ObjectInputStream(input);
			Object obj = objInput.readObject();
			Person p =(Person) obj;
			System.out.println("name:"+p.getName()+" age:"+p.getAge());
		}catch(IOException | ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{
				if(objInput != null){
					objInput.close();
				}
				if(input != null){
					input.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
