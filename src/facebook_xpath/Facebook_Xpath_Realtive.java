package facebook_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Xpath_Realtive {

	public static void main(String[] args)throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
      WebDriver driver=null;
      driver=new ChromeDriver();
      String u="http://facebook.com";
      driver.get(u);
       driver.manage().window().maximize();
       
     // data-testid="royal_email"
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("amogsiddha deshmukh");
    ////*[@id="pass"]--for id properties.
      //data-testid="royal_pass"
      //driver.findElement(By.xpath("//*[@data-testid='royal_pass']")).sendKeys("amd@1992");
	//relative xpath by id property
      driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("amd@1992");
      //data-testid="royal_login_button"
      //*-->=Represents the check all the html tag names.
	
	driver.findElement(By.xpath("//*[@data-testid='royal_login_button']")).click();
	}

}
