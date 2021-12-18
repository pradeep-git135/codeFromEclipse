package genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class WebdriverUtility {
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
