package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class  Baseclass {
	
	Properties prop;
	FileInputStream fis;
	
	String path;
	
	
	public Baseclass() throws IOException{
	
		path = System.getProperty("user.dir") + "//config.properties";
		fis = new FileInputStream(path);
		//fis =new FileInputStream(path);
		prop = new Properties();

		prop.load(fis);
		
		System.out.println("Update by Akshay");

	}
}
