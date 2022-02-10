package prcatice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigAnnotations {
	@BeforeSuite
	public void configBS() {
		System.out.println("executes before_suite");
	}
	@AfterSuite
	public void configAS() {
		System.out.println("executes after_suite");
	}
	@BeforeClass
	public void configBC() {
		System.out.println("executes before_class");
	}
	@AfterClass
	public void configAC() {
		System.out.println("executes after_class");
	}
	@BeforeMethod
	public void configBM() {
		System.out.println("executes before_each_method");
	}
	@BeforeTest
	public void configBT() {
		System.out.println("executes before_each_test");
	}
	@AfterTest
	public void configAT() {
		System.out.println("executes after_each_test");
	}
	@AfterMethod
	public void configAM() {
		System.out.println("executes after_each_method");
	}
	
	@Test(groups = {"smokeTest"})
	public void createContactTest() {
		System.out.println("executed createContactTest");
	}

	@Test(groups = {"regressionTest"})
	public void modifyContactTest() {
		System.out.println("executed modifyContactTest");
	}

}
