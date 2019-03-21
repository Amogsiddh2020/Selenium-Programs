package exceloperations.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Program2 {

	public static void main(String[] args) throws IOException
	{ 
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		// Thread.sleep(2000);
		FileInputStream file=new FileInputStream("F:\\selenium Automation programs\\seleniumproj\\src\\exceloperations\\com\\MultipleTestData.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rowcnt=sheet.getLastRowNum();
		
		for(int i=0;i<=rowcnt;i++)
		{
			Row r=sheet.getRow(i);
			
			int cellcnt=r.getLastCellNum();
			for(int j=0;j<cellcnt;j++)
			{
				String data =r.getCell(j).getStringCellValue();
				
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		
		}
}
