package genericUtility;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ListenerImplimentation  implements ITestListener {
	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test;
	public void onStart(ITestContext context) {
		//i will configure the report and attach the configuration 
		 spark=new ExtentSparkReporter("./extent.html");
		 spark.config().setTheme(Theme.STANDARD);
		 spark.config().setDocumentTitle("ProjectReport");
		 spark.config().setReportName("extentReports");
		 
		 extent=new ExtentReports();
		 extent.attachReporter(spark);
		 extent.setSystemInfo("osName", System.getProperty("os.name"));
		 extent.setSystemInfo("browser", "chrome");

	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName()+ "is passed");
	}

	public void onTestFailure(ITestResult result) {
		WebdriverUtility w=new WebdriverUtility();

		try {
//			WebDriver driver = new Demo().driver;
			WebDriver driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"+driver);
			w.captureScreenshot(driver, result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(w.captureScreenshot(driver, result.getMethod().getMethodName()));
			
			test.log(Status.FAIL, result.getMethod().getMethodName()+ " is failed");
			test.log(Status.FAIL, result.getThrowable());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName());
		test.log(Status.SKIP, result.getThrowable());

	}
	
}
