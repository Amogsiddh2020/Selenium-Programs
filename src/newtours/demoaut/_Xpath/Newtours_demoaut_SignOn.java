package newtours.demoaut._Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_demoaut_SignOn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
   WebDriver driver=null;
   driver=new ChromeDriver();
   String url="http://newtours.demoaut.com";
   driver.get(url);
   driver.manage().window().maximize();
   //SIGN-ON
  WebElement sign_on= driver.findElement(By.linkText("SIGN-ON"));
 
  String expected_url=sign_on.getAttribute("href");
  System.out.println("expecetd url is:"+expected_url);
  sign_on.click();
  String actual_url=driver.getCurrentUrl();
  System.out.println("actual url is:"+actual_url);
  if(actual_url.equals(expected_url))
  {
	  System.out.println("url is matched--pass");
  }
  else
  {
	  System.out.println("url is matched---failed");
  }
  driver.quit();
	}

}
