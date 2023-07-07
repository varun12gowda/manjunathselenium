package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OragnizationsPage {
	public OragnizationsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrganizationButton;

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement OrganizationNameTF;
	@FindBy(xpath = "(//input[@class='crmbutton small save'])[1]")
	private WebElement saveButton;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorIcon;
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;
	public WebElement getSignout() {
		return signout;
	}
	
	@FindBy(name = "accounttype")
	private WebElement typeDD;
	@FindBy(name = "industry")
	private WebElement industryDD;
	@FindBy(xpath="//a[@id='4']")
	private WebElement orgnames;

	public WebElement getOrgnames() {
		return orgnames;
	}

	public WebElement getAdministratorIcon() {
		return administratorIcon;
	}

	public WebElement getCreateOrganizationButton() {
		return createOrganizationButton;
	}

	public WebElement getOrganizationNameTF() {
		return OrganizationNameTF;
	}

	public WebElement getTypeDD() {
		return typeDD;
	}

	public WebElement getIndustryDD() {
		return industryDD;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

}
