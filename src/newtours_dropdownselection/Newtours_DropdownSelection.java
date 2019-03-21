package newtours_dropdownselection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newtours_DropdownSelection {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");		
WebDriver driver=null;		
driver=new ChromeDriver();
String url="http://www.newtours.demoaut.com";
driver.get(url);
driver.manage().window().maximize();
//link=REGISTER--property of register elements;
WebElement register=driver.findElement(By.linkText("REGISTER"));
register.click();
// country element property:name="country"
WebElement country=driver.findElement(By.name("country"));
Select s=new Select(country);

s.selectByIndex(8);
s.selectByValue("145");
s.selectByVisibleText("INDIA");
//index starts with zero
s.selectByIndex(1); 
//driver.quit();
	}
}
