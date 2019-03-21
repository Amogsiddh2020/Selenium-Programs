package amzonelinkelemnt.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonelinkelemnt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
   WebDriver driver=null;
   driver=new ChromeDriver();
   String url="http://www.amazone.com";
   driver.get(url);
   List<WebElement>achorlinks=driver.findElements(By.tagName("a"));
   int linkcount=achorlinks.size();
   System.out.println("no of links elements available amazone login page is:"+linkcount);
	for(int i=0;i<achorlinks.size();i++)
	{
		String linksname=achorlinks.get(i).getText();
		System.out.println(i+":"+"name of links is:"+linksname);
	}
	driver.quit();
	}

}
