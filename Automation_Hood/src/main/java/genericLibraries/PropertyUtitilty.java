package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 /***
  * 
  * @author manju
  *
  */
public class PropertyUtitilty implements IautoConstant {
	/**
	 * This method is used to fetch the value from property file and it returns String value of for the passed key
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	 public String readingDataFromPropertFile(String key) {
		 
		 FileInputStream fis = null;
		try {
			fis = new FileInputStream(PROPERTYFILEPATH);
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		 Properties ppt = new Properties();
		 try {
			ppt.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 return ppt.getProperty(key);
		 
	 }
	

}
