package exceloperation1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_MultipleData_FromExcelfile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("F:\\selenium Automation programs\\seleniumproj\\src\\exceloperation1\\Book11.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
	 //identifying the active last row number
		int rowcount = sheet.getLastRowNum();
		for(int i=0;i<=rowcount;i++) // goes to every active row
		{
			//goes to a row
			Row r = sheet.getRow(i);
			//in the row identifying total no of active cells
			int cellCount = r.getLastCellNum();
			for(int j=0;j<cellCount;j++)//goes to every active row of all the active cells
			{
				//get the data from the row of cell
				String data = r.getCell(j).getStringCellValue();
				System.out.print(data+" ");
			}
			System.out.println();
		}
			
	}


}

