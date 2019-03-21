package newtours.demoaut._Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_demoaut_pagesource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
  WebDriver driver=null;
  driver=new ChromeDriver();
  String url="http://newtours.demoaut.com";
  driver.get(url);
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  driver.manage().window().maximize();
  String expected_elemnt="Name";
  System.out.println("expected element is:"+expected_elemnt);
  String actual_pageSource= driver.getPageSource();
  System.out.println("actual page source is:"+actual_pageSource);
  if(actual_pageSource.contains(expected_elemnt))
  {
	  System.out.println("element is found in above source");
  }
  else
  {
	  System.out.println("element is not found in above source");
  }
  driver.quit();
	}

}
