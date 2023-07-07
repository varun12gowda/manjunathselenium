package V_tiger;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass;
import genericLibraries.ListenerIplementation;
@Listeners(genericLibraries.ListenerIplementation.class)
public class TC_03_Test extends BaseClass {
	@Test
	public void createContact() {
		
		homePage.getContactsTab().click();
		ListenerIplementation.logger.log(Status.INFO,"clicked on Contacts tab ");
		
		contactPage.getCreateContactIcon().click();
		ListenerIplementation.logger.log(Status.INFO,"Clicked on Create contact button");
		
		contactPage.getLastNameTF().sendKeys(utility.readingDataFromPropertFile("lastname"));
		ListenerIplementation.logger.log(Status.INFO,"Entered the value in Last name text field");
		
		contactPage.getSaveButton().click();
		ListenerIplementation.logger.log(Status.INFO,"Clicked on save button ");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		ut.switchToAlert().accept();
	
		
		
		
	}

}
