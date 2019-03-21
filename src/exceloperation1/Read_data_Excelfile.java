package exceloperation1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data_Excelfile {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
 FileInputStream file=new FileInputStream("F:\\selenium Automation programs\\seleniumproj\\src\\exceloperation1\\Book11.xlsx");
XSSFWorkbook wrbk=new XSSFWorkbook(file);
XSSFSheet sheet=wrbk.getSheet("sheet1");
Row r=sheet.getRow(0);
Cell c=r.getCell(0);

String data=c.getStringCellValue();
System.out.println("Message form excel file is: "+data);
	}

}
