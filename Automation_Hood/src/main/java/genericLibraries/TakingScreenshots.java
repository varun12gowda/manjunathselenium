package genericLibraries;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakingScreenshots extends BaseClass implements IautoConstant {
	public static String takingScreenShot(String screenshotName)  {
		/*
		 * its used to take screenShot 
		 */
		TakesScreenshot ts= (TakesScreenshot) driver;
		File photo = ts.getScreenshotAs(OutputType.FILE);
		
		String ldt = LocalDateTime.now().toString().replace(':', '-');
		String destination =System.getProperty("user.dir")+SSPATH+screenshotName+""+ldt+".png";
		File dest = new File(SSPATH+screenshotName+ldt+".png");
		try {
			FileUtils.copyFile(photo, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return destination;
	}

}
