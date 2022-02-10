package extent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(genericUtility.ImplimentationListener.class)
public class DemoExtent {
	
	@Test
	public void tc01() {
		System.out.println("executed tco1");
	}
	public WebDriver driver;
	@Test
	public void tc02() {
		System.out.println("executed tco2");
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Assert.fail("intentional fail");
	}

	@Test
	public void tc03() {
		System.out.println("executed tc03");
		throw new SkipException("intentional skip");
	}


}
