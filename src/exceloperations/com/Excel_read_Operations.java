package exceloperations.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read_Operations {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		FileInputStream file=new FileInputStream("F:\\selenium Automation programs\\seleniumproj\\src\\excelfile\\Book11.xlsx");
	 
		XSSFWorkbook wrkbk=new XSSFWorkbook(file);
		XSSFSheet sheet=wrkbk.getSheet("sheet1");
		Row r=sheet.createRow(2);
		Cell c=r.createCell(3);
		Cell cc=r.createCell(4);
		c.setCellValue("Mauli");
		cc.setCellValue("Amogsiddha");
		Cell ccc=r.createCell(2);
		ccc.setCellValue("Amogsiddha");
		//Row r1=sheet.createRow(2);
		//Cell c1=r.createCell(2);
		//c.setCellValue("Amogsiddha");
		FileOutputStream f=new FileOutputStream("F:\\selenium Automation programs\\seleniumproj\\src\\excelfile\\Book11.xlsx");
            wrkbk.write(f);
	}

}
