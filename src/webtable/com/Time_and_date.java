package webtable.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Time_and_date {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
    WebDriver driver=null;
    driver=new ChromeDriver();
    String url="https://www.timeanddate.com/worldclock/";
    driver.get(url);
    driver.manage().window().maximize();
    // /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
String	string=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]")).getText();
	
	System.out.println("string is: "+string);
	}
	

}
