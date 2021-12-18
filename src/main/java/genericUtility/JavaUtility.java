package genericUtility;

import java.util.Date;

public class JavaUtility {

	public String getDate() {
		return new Date().toString().replace(" ", "_").replace(":", "_");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new JavaUtility().getDate()); 

	}

}
