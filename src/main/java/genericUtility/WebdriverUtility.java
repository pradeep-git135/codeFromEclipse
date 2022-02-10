package genericUtility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class WebdriverUtility {
	
	public void mousehoverAndClick(WebDriver driver, WebElement element1, WebElement element2) {
		Actions a = new Actions(driver);
		a.moveToElement(element1);
		a.click(element2);
	}
	
	public void maximizeAndWaitForPageLoad(WebDriver driver) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public String captureScreenshot(WebDriver driver,String screenshotName) {
		File srcFile = new EventFiringWebDriver(driver).getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(System.getProperty("user.dir")+"/screenshots/"+new JavaUtility().getDate()+"_"+screenshotName+"_.png");
		try {
			Files.copy(srcFile, destinationFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return destinationFile.getAbsolutePath();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
