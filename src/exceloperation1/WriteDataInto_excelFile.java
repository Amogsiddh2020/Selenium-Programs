package exceloperation1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class WriteDataInto_excelFile {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("F:\\selenium Automation programs\\seleniumproj\\src\\exceloperation1\\Book1a.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
        Row r = sheet.createRow(2);
        //Cell c = r.createCell(3);
         //c.setCellValue("Amol");
       org.apache.poi.ss.usermodel.Cell c=r.createCell(2);
       c.setCellValue(" Sveri,Coe Pandharpur,Solapur University,Solapur ");
        FileOutputStream file1 =new FileOutputStream("F:\\selenium Automation programs\\seleniumproj\\src\\exceloperation1\\Book1a.xlsx");
	 workBook.write(file1);
	}

}
