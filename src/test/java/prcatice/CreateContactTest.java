package prcatice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactTest {
	
@Parameters("browser")
	@Test
	public void createContactTest(@Optional("chrome") String browser) {
	WebDriver driver = null;
	if (browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}else if (browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}else {
		System.out.println("enter a valid browser name");
	}
		
		driver.get("https://mvnrepository.com/");
	}
	
//	@Test
//	public void createOrgTest() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		
//	}

}


