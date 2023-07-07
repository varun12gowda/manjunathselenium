package V_tiger;

import java.util.Set;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
//@Listeners(genericLibraries.ListenerIplementation.class)
public class TC_04_Test extends BaseClass {
	@Test
	public void createContactWithOrgName() {
	
		homePage.getContactsTab().click();
		
		contactPage.getCreateContactIcon().click();
		
		contactPage.getLastNameTF().sendKeys(utility.readingDataFromPropertFile("lastname"));
		
		String parentId = driver.getWindowHandle();
		
		contactPage.getAddOrgNameIcon().click();
		
		Set<String> allId= driver.getWindowHandles();
		for (String id : allId) {
			driver.switchTo().window(id);
			
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ut.switchToWindow(allId, targetWindowId);
		ogpage.getOrgnames().click();
	
		ogpage.getSaveButton();
		
		driver.switchTo().window(parentId);
	
		
		contactPage.getSaveButton().click();
	
		
		
		
	}

}
