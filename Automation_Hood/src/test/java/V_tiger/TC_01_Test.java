package V_tiger;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass;
import genericLibraries.ListenerIplementation;
@Listeners(genericLibraries.ListenerIplementation.class)
public class TC_01_Test extends BaseClass {

	 
	@Test
	public void createOraganization()  {
	
		homePage.getOrganizatinsTab().click();
		ListenerIplementation.logger.log(Status.INFO, "Clicked on Oraganization tab");
		
		ogpage.getCreateOrganizationButton().click();
		ListenerIplementation.logger.log(Status.INFO,"Clicked on  create Oraganization button");
		
		ogpage.getOrganizationNameTF().sendKeys(utility.readingDataFromPropertFile("orgname"));
		ListenerIplementation.logger.log(Status.INFO,"Entered the value in Oraganization name text field");
		
		ogpage.getSaveButton().click();
		ListenerIplementation.logger.log(Status.INFO,"Clicked on saved button");

		//WebElement element = ogpage.getAdministratorIcon();
		//ut.moveToElement(element);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		ut.switchToAlert().accept();
	//	Thread.sleep(3000);
		
		ListenerIplementation.logger.log(Status.INFO,"Test case passed ");


	}

}
