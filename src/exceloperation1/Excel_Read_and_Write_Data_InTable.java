package exceloperation1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Read_and_Write_Data_InTable {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
       WebDriver driver =null;
       driver=new ChromeDriver();
       String url="http://newtours.demoaut.com";
       driver.get(url);
     driver.manage().window().maximize();	
     //REGISTER
     WebElement reg=driver.findElement(By.linkText("REGISTER"));
     
     reg.click();
     List<WebElement>country=driver.findElements(By.tagName("option"));
     int cc=country.size();
     System.out.println("count is: "+cc);
     FileInputStream file=new FileInputStream("F:\\selenium Automation programs\\seleniumproj\\src\\exceloperation1\\Book11.xlsx");
     XSSFWorkbook workbook=new XSSFWorkbook(file);
     XSSFSheet sheet=workbook.getSheet("sheet1");
     for(int k=0;k<cc;k++)
     {
    	 Row r=sheet.createRow(k);
    	 Cell c=r.createCell(0);
    	 String countryname=country.get(k).getText();
    	 System.out.println(countryname);
    	 c.setCellValue(countryname);
    	 FileOutputStream file1=new FileOutputStream("F:\\selenium Automation programs\\seleniumproj\\src\\exceloperation1\\Book11.xlsx");
    	 workbook.write(file1);
     }
    		 }

}
