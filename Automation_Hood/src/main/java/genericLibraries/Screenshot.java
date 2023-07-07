package genericLibraries;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new  EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File photo = ts.getScreenshotAs(OutputType.FILE);
		String ldt=LocalDateTime.now().toString().replace(":", "-");
		File dest = new File("./Screenshot/demo "+ ldt+ ".png");
		FileUtils.copyFile(photo, dest);
		//  photo.renameTo(dest);
		driver.quit();
		
	}

}
