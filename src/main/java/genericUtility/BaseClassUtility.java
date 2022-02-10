package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import elementRepo.HomePage;
import elementRepo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassUtility {
	public WebDriver driver;
	public FileUtility fileUtil;
	public WebdriverUtility webUtil;
	public HomePage hp;
	
	@BeforeSuite
	public void configBS() {
		System.out.println("connect to DB");
	}
	
	@AfterSuite()	
	public void configAS() {
		System.out.println("close DB");
	}
	
	
	@BeforeClass()
	public void configBC() throws Throwable {
		System.out.println("launch browser");
		 fileUtil = new FileUtility();
		 webUtil = new WebdriverUtility();
		String browser =  fileUtil.getPropertyFromKey("browser");
		String url = fileUtil.getPropertyFromKey("url");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println(browser+ "browser launched");
		}
		else if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println(browser+ "browser launched");
		}
		else {
			System.out.println("incorrect browserNmae");
		}
		webUtil.maximizeAndWaitForPageLoad(driver);
		driver.get(url);
	}
	
	@AfterClass()	
	public void configAC() {
		System.out.println("close browser");
		driver.close();
	}
	
	@BeforeMethod()
	public void configBM() throws Throwable {
		hp = new HomePage(driver);
		new LoginPage(driver).loginToApplication(fileUtil.getPropertyFromKey("username"), fileUtil.getPropertyFromKey("password"));
//		new LoginTest().login();
		System.out.println("login to application");
	}
	
	@AfterMethod()
	public void configAM() {
		
//		new LogOffTest().logout();
		System.out.println("logout from application");
	}






}
