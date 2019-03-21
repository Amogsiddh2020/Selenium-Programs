package webtable.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_allColumn_element {

	public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
   WebDriver driver=null;
   driver=new ChromeDriver();
   String url="https://www.timeanddate.com/worldclock/";
   driver.get(url);
driver.manage().window().maximize();
for(int i=1;i<=36;i++)
{
String cityname=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]/a")).getText();
System.out.println("cityname are :"+cityname);
}
// System.out.println("cityname are :"+cityname);
	}

}
