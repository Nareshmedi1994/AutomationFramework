package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * this class consist of generic methods to use
 * @author NARESH MEDI
 * 
 */
public class PropertyFileUtility {
	/**
	 * this method will use read data from property file and return the value to caller
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromProertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
	Properties p = new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
