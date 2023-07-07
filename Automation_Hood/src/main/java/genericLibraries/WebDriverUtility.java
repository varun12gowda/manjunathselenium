package genericLibraries;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility extends BaseClass {

	/*
	 * this is method is used for drang and drop purpose
	 * 
	 * @param src
	 * 
	 * @param destination
	 */
	public void dragAndDropp(WebElement src, WebElement destination) {
		Actions action = new Actions(driver);
		action.dragAndDrop(src, destination).perform();
	}

	/*
	 * this method is used to perform right click action
	 */
	public void rightClick() {
		Actions action = new Actions(driver);

		action.contextClick().perform();
	}

	/**
	 * 
	 * @param element this method used for perform right click operations with
	 *                parameters
	 */
	public void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	public void doubleclick() {
		/*
		 * this method is used to perform doublick click on element
		 */
		Actions action = new Actions(driver);
		action.doubleClick().perform();
	}

	/**
	 * 
	 * @param element
	 */
	public void doubleclick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	/**
	 * this method is used for mouse Hover
	 * 
	 * @param element
	 */
	public void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	/**
	 * 
	 * @param element this method is used for mouse hover on element with passing an
	 *                parameters
	 */
	public void mouseHoverOnElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	/**
	 * 
	 * @param dropdown
	 * @return retrun the dropdown value
	 */
	public Select selectReference(WebElement dropdown) {

		Select select = new Select(dropdown);
		return select;
	}

	/**
	 * This method is used to handaling the dropdown mainly for selectbyVisableText
	 * method & SelectByValue method
	 * 
	 * @param dropdown
	 * @param index
	 */
	public void handlingDropDown(WebElement dropdown, String text) {

		Select select = new Select(dropdown);
		try {
			select.selectByVisibleText(text);
		} catch (Exception e) {
			select.selectByValue(text);
		}

	}

	/**
	 * This method is used to handaling the dropdwon which is having index value in
	 * dropdown
	 * 
	 * @param dropdown
	 * @param index
	 */
	public void handlingDropDown1(WebElement dropdown, int index) {

		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}

	/**
	 * to scroll the webpage by using scrollBy
	 * 
	 * @param x
	 * @param y
	 */
	public void scrollingAction(int x, int y) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
	}

	public void clickonElement(int x, int y) {
		/*
		 * Single click by using javascript executor
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click()", driver);
	}

	public void enteringDataintoElement(WebElement element, String data) {
		/*
		 * It's act like sendKeys basically used to send the data into filed
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value'" + data + "'", element);
	}

	public void clearingDataFromElement(WebElement element) {
		/*
		 * It's simular to clear It's used to clear the text into filed
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].' '", element);
	}

	public void switchingToFrame(int index) {
		/*
		 * It's used to Switch control into frame by using integer
		 */
		driver.switchTo().frame(index);
	}

	public void switchingToFrame(WebElement element) {
		/*
		 * It's used to Switch control into frame by using element
		 */
		driver.switchTo().frame(element);
	}

	public void switchingToFrame(String data) {
		/*
		 * It's used to Switch control into frame by using string
		 */
		driver.switchTo().frame(data);
	}

	public void switchingBackToMain() {
		/*
		 * It's used to Switch control to back to webpage (default page)
		 */
		driver.switchTo().defaultContent();
	}

	public Alert switchToAlert() {
		/*
		 * Switch the control into AlertPopup & Return the alert
		 */
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	public void switchToWindow(Set<String> allWindowID, String targetWindowTitile) {
		/*
		 * its used to change mouse control into newpage or newtab
		 */
		for (String idd : allWindowID) {
			driver.switchTo().window(idd);
			if (targetWindowTitile.equalsIgnoreCase(driver.getTitle())) {
				break;
			} else {
				driver.close();
			}
		}
	}

	public void enteringDataIntoElement(String data, WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+data+"'", element);
	}
	
	public void clearingDataFromElement1(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=' '", element);

	}
}
