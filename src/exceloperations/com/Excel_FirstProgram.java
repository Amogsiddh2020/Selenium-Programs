package exceloperations.com;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_FirstProgram {

	public static void main(String[] args) throws IOException 
	{
	
      
    FileInputStream file=new FileInputStream("F:\\selenium Automation programs\\seleniumproj\\src\\com\\exceloperations\\aaaaaa.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);  
     
     XSSFSheet sheet=workbook.getSheet("Sheet1");
     
     Row r=sheet.getRow(2);
     Cell c=r.getCell(0);
     String data=c.getStringCellValue();
     
     System.out.println(data);
       
       
	}

}
