package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
	// step 1----->open the document in java readable foemat
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		//step2:create obj of properties class from java.util
		Properties p = new Properties();
		//step 3: Load the document to properties class
		p.load(fis);
		//Step 4:provide the and fetch value
		String value =p.getProperty("username");
		System.out.println(value);
		String value1=p.getProperty("url");
		System.out.println(value1);
		
		
		
		
		

	}

}
