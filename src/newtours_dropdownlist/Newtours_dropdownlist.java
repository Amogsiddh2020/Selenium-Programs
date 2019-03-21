package newtours_dropdownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_dropdownlist {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
     WebDriver driver=null;
     driver=new  ChromeDriver();
     String url="http://www.newtours.demoaut.com";
     driver.get(url);
     driver.manage().window().maximize();
     //<input type="text" name="userName" size="10">
    // <a href="mercuryregister.php">REGISTER</a>
	WebElement register=driver.findElement(By.linkText("REGISTER"));
	register.click();
// country property:	name="country"
	
WebElement country=driver.findElement(By.name("country"));
List<WebElement>countries=country.findElements(By.tagName("option"));
int countriesc=countries.size();
System.out.println("no of country is :"+countriesc);
for(int j=0;j<countriesc;j++)
{
String countriesName=countries.get(j).getText();
System.out.println(j+":"+"name of the countries are "+countriesName);
}
}
}
