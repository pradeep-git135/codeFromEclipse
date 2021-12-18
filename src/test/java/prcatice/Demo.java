package prcatice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(genericUtility.ListenerImplimentation.class)
public class Demo {
	public WebDriver driver;
	
	@Test
	public void demo1() {
		System.out.println("executing demo1");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com");
//		
		throw new SkipException("intentional skip");
	}
	@Test
	public void demo2() {
		System.out.println("executing dempo1");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Assert.fail("intentionalFail");
		
	}
	@Test
	public void demo3() {
		System.out.println("executing demo3");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com");
		
	}

}
