package Project.First;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadData {

	public String FromProperties(String Key)
	{
		Properties prop = new Properties();
		InputStream input = null;
		String Value=null;
		try {

			input = new FileInputStream("./src/TestData/TestData.properties");

			// load a properties file
			prop.load(input);
			
		Value=prop.getProperty(Key);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		} 
	 return Value;
	}
}
