package exceloperation1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cpature_TableData_Newtours {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		WebDriver driver= null;
	    driver= new ChromeDriver();
		String url = "http://newtours.demoaut.com";
		driver.get(url);
		//<input type="text" name="userName" size="10">
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//WebElement  actual_Email = driver.findElement(By.name("userName"));
		    FileInputStream file = new FileInputStream("F:\\selenium Automation programs\\seleniumproj\\src\\exceloperation1\\logindata.xlsx");
			XSSFWorkbook workBook = new XSSFWorkbook(file);
			XSSFSheet sheet = workBook.getSheet("Sheet1");
			String email =  sheet.getRow(1).getCell(0).getStringCellValue();
						
			//<input type="text" name="userName" size="10">
			WebElement  actual_Email = driver.findElement(By.name("userName"));
			actual_Email.sendKeys(email);
			String pswd = sheet.getRow(1).getCell(1).getStringCellValue();
			
			//<input type="password" name="password" size="10">
			WebElement actual_pswd = driver.findElement(By.name("password"));
			actual_pswd.sendKeys(pswd);
			//<input type="image" name="login" value="Login"
			driver.findElement(By.name("login")).click();
			
			String actualUrl = driver.getCurrentUrl();
			System.out.println("the current url of NewTours is:" +actualUrl);
			String expectedUrl = "http://newtours.demoaut.com";
			System.out.println("the expected url is:" +expectedUrl);
			if(actualUrl.contains(expectedUrl))
			{
				
				sheet.createRow(1).createCell(2).setCellValue("url matched - pass");
			}
			else
			{
				
	        sheet.createRow(1).createCell(2).setCellValue("url not matched - fail");
			}
			 
		     FileOutputStream file1 =new FileOutputStream("F:\\sselenium Automation programs\\seleniumproj\\src\\exceloperation1\\logindata.xlsx");
          workBook.write(file1);		

	}

}
