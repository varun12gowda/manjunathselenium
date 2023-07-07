package V_tiger;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass;
import genericLibraries.ListenerIplementation;
@Listeners(genericLibraries.ListenerIplementation.class)
public class TC_02_Test extends BaseClass  {
	@Test
	public void createOrgWithTypeAndIndustry() {

		homePage.getOrganizatinsTab().click();
		ListenerIplementation.logger.log(Status.INFO,"Clicked on Oraganization tab");
		
		ogpage.getCreateOrganizationButton().click();
		ListenerIplementation.logger.log(Status.INFO,"Clicked on  create Oraganization button");
		
		ogpage.getOrganizationNameTF().sendKeys("MBH");
		ListenerIplementation.logger.log(Status.INFO,"Entered the value in Oraganization name text field");
		
		WebElement type = ogpage.getTypeDD();
		ut.selectReference(type).selectByValue("Analyst");
		ListenerIplementation.logger.log(Status.INFO,"select the Analsyt from type dropdown value");
		
		WebElement industry = ogpage.getIndustryDD();
		ut.selectReference(industry).selectByValue("Banking");
		ListenerIplementation.logger.log(Status.INFO,"select the Banking fron industy dropdown");
		
		
		
		ogpage.getSaveButton().click();
		ListenerIplementation.logger.log(Status.INFO,"Clicked on saved button");
		
		ListenerIplementation.logger.log(Status.INFO,"Test case passed ");
		
		
	}
}
