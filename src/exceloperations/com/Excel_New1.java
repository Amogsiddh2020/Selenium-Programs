package exceloperations.com;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_New1 {

	public static void main(String[] args) throws IOException 
	{
   System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
  
   FileInputStream file=new FileInputStream("F:\\selenium Automation programs\\seleniumproj\\src\\exceloperations\\com\\aaaaaa.xlsx");
  
   XSSFWorkbook workbook=new XSSFWorkbook(file);
  
   XSSFSheet sheet=workbook.getSheet("sheet1");
  
   Row r=sheet.getRow(0);
  
   Cell c=r.getCell(0);
  
   String data=c.getStringCellValue();
  
   System.out.println(data);

	}

}
