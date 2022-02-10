package prcatice;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo2  {

	@Test(retryAnalyzer =  genericUtility.RetryImplimentation.class)
	public void tco1_test() {
		System.out.println("executing tco1_test");
		Assert.fail();
	}
}
