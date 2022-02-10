package genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ImplimentationListener implements ITestListener {
	
	public ExtentTest test;
	public void onTestStart(ITestResult result) {
	    // not implemented
		 test = reports.createTest(result.getMethod().getMethodName());
	
	  }

	public void onTestSuccess(ITestResult result) {
	    // not implemented
//		reports.createTest(result.getMethod().getMethodName()).log(Status.PASS, result.getMethod().getMethodName()+" is passed")
		test.log(Status.PASS, result.getMethod().getMethodName() +" is passed");
	  }

	public void onTestFailure(ITestResult result) {
	    // not implemented
		test.log(Status.FAIL, result.getMethod().getMethodName() +" is failed");
		test.log(Status.FAIL, result.getThrowable());
		
		WebDriver driver;
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			EventFiringWebDriver efd = new EventFiringWebDriver(driver);
			File source = efd.getScreenshotAs(OutputType.FILE);
			File destination = new File("./screenshots/"+result.getMethod().getMethodName()+"_.png");
			test.addScreenCaptureFromPath(destination.getAbsolutePath());
			Files.copy(source, destination);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	  }

	public void onTestSkipped(ITestResult result) {
	    // not implemented
		test.log(Status.SKIP, result.getMethod().getMethodName() +" is skipped");
		test.log(Status.SKIP, result.getThrowable());
	  }
	
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public void onStart(ITestContext context) {
		//configure the extent report  
		//ExtentReports 
		//ExtentSparkReporter 
		//ExtentTest
		
		String date = new JavaUtility().getDate();
		
		spark = new ExtentSparkReporter("./extentReports/"+date+"_demoExtentReport.html");
		spark.config().setDocumentTitle("ExtentReport");
		spark.config().setReportName("execution_details");
		spark.config().setTheme(Theme.STANDARD);
			
		//attaching the report  //	    //attaching the extent report

		reports = new ExtentReports();
		reports.attachReporter(spark);
		reports.setSystemInfo("os", System.getProperty("os.name"));
		reports.setSystemInfo("browsr", "chrome");
		reports.setSystemInfo("author", "pradeep");	
	  }

	public void onFinish(ITestContext context) {
	    // not implemented
		reports.flush();
	  }
}
