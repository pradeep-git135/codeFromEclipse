package prcatice;

import org.testng.annotations.Test;

public class CommandLineParameterTest {
	@Test
	public void tc_o1() {
		String value = System.getProperty("url");
		String value1 = System.getProperty("fname");
		String value2 = System.getProperty("lname");


		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);
	}

}
