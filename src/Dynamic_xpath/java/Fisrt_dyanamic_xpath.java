package Dynamic_xpath.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fisrt_dyanamic_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
       WebDriver driver=null;
       driver=new ChromeDriver();
       String url="http://register.rediff.com/register/register.php?Form name=user-details";
       driver.get(url);
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//*[starts-with(@name,'name')]")).sendKeys("amol");
       // driver.findElement(By.xpath("//*[starts-with(@id,'name')]")).sendKeys("amogsiddh@gmail.com");
       driver.quit();
	}

}
