package genericUtility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public String getDataFromExcel(String sheetName,int rowNum, int colNum) throws Throwable {
		FileInputStream fis = new FileInputStream("F:\\seleniumJava\\practiceSelenium\\src\\demoSelenium\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetName);
		int rows = sheet.getLastRowNum();
		short columns = sheet.getRow(0).getLastCellNum();
		
		 String data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
		
		System.out.println("total number of rows "+rows);
		System.out.println("total number of columns "+columns);
		
		for (int i = 0; i <rows; i++) {
			for (int j = 0; j < columns; j++) {
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println("");
			
		}
		return data;

		
		
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("data from the method "+new ExcelUtility().getDataFromExcel("sheet1", 0, 0));
		System.out.println("data from the method "+new ExcelUtility().getDataFromExcel("sheet1", 1, 2));

		

	}

}
