package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	public String getPropertyFromKey(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\commonData\\commonData.properties");
		Properties properties = new Properties();
		properties.load(fis);
		return  properties.getProperty(key);
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(new FileUtility().getPropertyFromKey("browser"));

	}

}
