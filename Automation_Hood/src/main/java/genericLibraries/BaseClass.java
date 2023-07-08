package genericLibraries;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.ContactPage;
import objectRepository.HomePage;
import objectRepository.LeadsPage;
import objectRepository.LoginPage;
import objectRepository.NewEventDD;
import objectRepository.OragnizationsPage;

public class BaseClass {
	public static WebDriver driver;
	public PropertyUtitilty utility;
	public HomePage homePage; 
	public LoginPage loginpage;
	public OragnizationsPage ogpage;
	public ContactPage contactPage;
	public LeadsPage leadsPage;
	public 	WebDriverUtility ut;
	public NewEventDD newEventDD;

	
	
	@BeforeSuite(alwaysRun=true)
	public void LaunchingTheBrowser() {
		utility=new PropertyUtitilty();
		if(utility.readingDataFromPropertFile("browser").equals("chromee")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		System.out.println("code added");
		driver.get(utility.readingDataFromPropertFile("url"));
		loginpage= new LoginPage(driver);
		loginpage.getUserNameTF().sendKeys(utility.readingDataFromPropertFile("username"));
		assertEquals(utility.readingDataFromPropertFile("username"), loginpage.getUserNameTF().getAttribute("value"));
		loginpage.getPasswordTF().sendKeys(utility.readingDataFromPropertFile("password"));
		assertEquals(utility.readingDataFromPropertFile("password"), loginpage.getUserNameTF().getAttribute("value"));
		loginpage.getLoginButton().click();
	}
	@BeforeMethod(alwaysRun = true)
	public void navigateToApplication() {
		
		
		homePage= new HomePage(driver);
		
		ogpage=new OragnizationsPage(driver);
		
		leadsPage=new LeadsPage(driver);
		
		ut=new WebDriverUtility(); 
		
		contactPage =new ContactPage(driver);
		
		newEventDD=new NewEventDD(driver);
		
		
	}
	@AfterMethod(alwaysRun=true)
	public void loggingOut() {  
		System.out.println("logged out");
	}
	@AfterSuite
	public void tearDownTheBrowser() {
		ut.mouseHoverOnElement(ogpage.getAdministratorIcon());
		ogpage.getSignout().click();
		System.out.println("signed out from application");
		driver.quit();
	}
	
	}
	

