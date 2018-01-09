package agency;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestFactory {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("D://aa.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Subject s1 = Factory.getInstance(prop.getProperty("className"));
		s1.say("张三");
	}

}
