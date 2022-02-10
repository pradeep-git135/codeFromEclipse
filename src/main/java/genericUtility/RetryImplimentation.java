package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImplimentation implements IRetryAnalyzer{
	int counter = 0;
	int retryCount = 3;

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (counter<retryCount) {
			counter++;
			return true;
		}
		return false;
	}
	

}
