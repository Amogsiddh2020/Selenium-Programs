package newtours.demoaut._Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_Xpath_AbsolutePath {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
  WebDriver driver=null;
  driver=new ChromeDriver();
  String url="http://newtours.demoaut.com";
  driver.get(url);
  driver.manage().window().maximize();
  driver.findElement(By.linkText("Vacations")).click();
  Thread.sleep(2000);
  //src="/images/forms/home.gif"
  // driver.findElement(By.xpath("//*[@]src='/images/for
  //ms/home.gif'")).click();
  // /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img]")).click();
//  /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b
	
	driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).click();}

}
