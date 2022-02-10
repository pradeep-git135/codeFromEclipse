package genericUtility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public String getDate() {
		return new Date().toString().replace(" ", "_").replace(":", "_");
	}
	
	public int getRandomNum() {
		Random random = new Random();
		return random.nextInt(1000);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new JavaUtility().getDate()); 

	}

}
