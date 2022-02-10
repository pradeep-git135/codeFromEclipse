package prcatice;

import org.testng.annotations.Test;

public class Demo3Test {
	
	@Test(priority = 3, groups = {"smokeTest"})
	public void tc01() {
		System.out.println("executed tc01");
//		Assert.fail("intentional fail");
	}
	@Test(priority = 2,groups = {"smokeTest"})
	public void tc02() {
		System.out.println("executed tc02");
//		throw new SkipException("intentional skip");
	}
	@Test(priority = 1, groups = {"regressionTest"})
	public void tc03() {
		System.out.println("executed tc03");
	}

}
