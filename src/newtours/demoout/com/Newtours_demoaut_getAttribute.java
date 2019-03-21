package newtours.demoout.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_demoaut_getAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
    WebDriver driver=null;
    driver=new ChromeDriver();
    String url="http://newtours.demoaut.com";
    driver.get(url);
    driver.manage().window().maximize();
   // REGISTER---link property
   WebElement register= driver.findElement(By.linkText("REGISTER"));
   //href------attribute
   String expected_url=register.getAttribute("href");
   System.out.println("expected url is:"+expected_url);
   register.click();
   String actual_url=driver.getCurrentUrl();
   System.out.println("Actual url is:"+actual_url);
   if(actual_url.equals(expected_url))
   {
	   System.out.println("url is matched--pass");
   }
   else
   {
	   System.out.println("url is not matched--fail");
   }
driver.quit();   
	}
}
