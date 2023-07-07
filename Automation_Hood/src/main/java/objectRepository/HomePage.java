package objectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="(//a[text()='Organizations'] )[1]")
	private WebElement organizatinsTab;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactsTab;
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leadsTab;
	@FindBy(xpath="//select[@id='qccombo']")
	private WebElement quickCreateDropdown;
	
	public WebElement getQuickCreateDropdown() {
		return quickCreateDropdown;
	}
	public WebElement getLeadsTab() {
		return leadsTab;
	}
	public WebElement getContactsTab() {
		return contactsTab;
	}
	public WebElement getOrganizatinsTab() {
		return organizatinsTab;
	}
	
	

}
