package V_tiger;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
@Listeners(genericLibraries.ListenerIplementation.class)
public class TC_08_Test extends BaseClass {
	@Test
	public void createDuplicateAndDeleteLeads() {
		String FirstName="Manjunath";
		homePage.getLeadsTab().click();
		
		leadsPage.getCreateLeadIcon().click();
		
		leadsPage.getFirstNameTF().sendKeys(FirstName);
		
		leadsPage.getLastNameTF().sendKeys("Horakeri");
	
		leadsPage.getCompantTF().sendKeys("DND");
		
		//assertEquals(driver.getTitle().equals(FirstName),true);
		
		leadsPage.getSaveButton().click();
		
		leadsPage.getDuplicateButton().click();
		
		leadsPage.getSaveButton().click();
		
		leadsPage.getDeleteButton().click();
		
		ut.switchToAlert().accept();
		
		driver.navigate().refresh();
		
		homePage.getLeadsTab().click();
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//a[text()='"+FirstName+"']/../..//input[@name='selected_id']"));
		
		for (WebElement webElement : checkbox) {
			webElement.click();
			
		}
		
		leadsPage.getDeleteButton().click();
		
		ut.switchToAlert().accept();
		
		
		
		
		
		
	}
	

}
