package prcatice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(genericUtility.ListenerImplimentation.class)
public class SampleTest {
	public WebDriver driver;
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://amazon.in");
		 Assert.fail();
		 
	}

}
