package webtable.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_citynameBy_parts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
     WebDriver driver=null;
     driver=new ChromeDriver();
     String url="https://www.timeanddate.com/worldclock/";
     driver.get(url);
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  String part1= "/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
   String part2="]/td[1]/a";
   for(int i=1;i<=36;i++)
   {
String cityname	= driver.findElement(By.xpath(part1+i+part2)).getText();
  System.out.println("cityname is:"+cityname); 
  }
   driver.quit();
	}

}
