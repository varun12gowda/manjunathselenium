package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewEventDD {
	public  NewEventDD(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjectTF;
	
	@FindBy(xpath="//select[@name='eventstatus']")
	private WebElement statusDD;
	
	@FindBy(xpath="//input[@name='due_date']")
	private WebElement endDateTF;
	
	@FindBy(xpath="//input[@name='date_start']")
	private WebElement startDateTF;
	
	@FindBy(xpath="//input[@name='time_start']")
	private WebElement startTimeTF;
	
	@FindBy(xpath="//select[@name='activitytype']")
	private WebElement activityTypeDD;
	
	@FindBy(xpath="//tbody/tr[3]/td[4]/input[2]")
	private WebElement assignToGroupRadioButton;
	
	@FindBy(xpath="/html[1]/body[1]/div[4]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[4]/span[2]/select[1]")
	private WebElement aassignToGroupDD;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSubjectTF() {
		return subjectTF;
	}

	public WebElement getStatusDD() {
		return statusDD;
	}

	public WebElement getEndDateTF() {
		return endDateTF;
	}

	public WebElement getStartDateTF() {
		return startDateTF;
	}

	public WebElement getStartTimeTF() {
		return startTimeTF;
	}

	public WebElement getActivityTypeDD() {
		return activityTypeDD;
	}

	public WebElement getAssignToGroupRadioButton() {
		return assignToGroupRadioButton;
	}

	public WebElement getAassignToGroupDD() {
		return aassignToGroupDD;
	}

}
