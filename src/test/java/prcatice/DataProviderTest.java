package prcatice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider = "dataTest")
	public void dataProviderTest(String value1, String value2) {
		System.out.println("source : "+value1+"===>"+"destination : "+value2);
	}
	
	@DataProvider
	public Object[][] dataTest(){
		Object[][] data = new Object[3][2];
		data[0][0] = "bengalore";
		data[0][1] = "goa";
		data[1][0] = "bengalore";
		data[1][1] = "hyderabad";
		data[2][0] = "bengalore";
		data[2][1] = "bengalore";
		return data;
	}

}
