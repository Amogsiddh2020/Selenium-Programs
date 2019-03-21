package facebookkeyboard.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebbok_keyboardelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String url="http://facebook.com";
		driver.get(url);
		driver.manage().window().maximize();
	//	email
		driver.findElement(By.id("email")).sendKeys("amogsiddha deshmukh");
		Actions a=new Actions(driver);
      a.sendKeys(Keys.TAB).perform();
      a.sendKeys("amd861992").perform();
      a.sendKeys(Keys.ENTER).perform();
      driver.quit();
	}

}
