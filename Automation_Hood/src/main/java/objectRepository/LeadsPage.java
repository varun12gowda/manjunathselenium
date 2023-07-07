package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createLeadIcon;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTF;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	
	@FindBy(name = "company")
	private WebElement compantTF;
	
	@FindBy(id = "13")
	private WebElement checkBox;
	
	@FindBy(xpath="(//input[@title='Duplicate [Alt+U]'])[1]")
	private WebElement duplicateButton;
	
	
	public WebElement getDuplicateButton() {
		return duplicateButton;
	}

	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTF;
	
	@FindBy(xpath = "(//input[@value='Delete'])[1]")
	private WebElement deleteButton;

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getCompantTF() {
		return compantTF;
	}

	public WebElement getCreateLeadIcon() {
		return createLeadIcon;
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

}
