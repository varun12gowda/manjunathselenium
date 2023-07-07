package practice;

import org.testng.annotations.Test;

import genericLibraries.ExcelUtllity;
import genericLibraries.IautoConstant;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo112 implements IautoConstant {
	@Test (dataProvider="testdata",dataProviderClass=ExcelUtllity.class)
	public void  ReadingDataFromExternalData(String un,String pw) {
		
	WebDriverManager.edgedriver().setup();
	}
}

