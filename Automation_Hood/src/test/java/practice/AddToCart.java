package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {
	@Test 
	public void addToCart(){
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Watches");
		driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
		String parentId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),\"Minimalists Analog Watch  - For Men 38024PP25\")]")).click();

	driver.findElement(By.xpath("(//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));

		driver.quit();
		
	}

}
