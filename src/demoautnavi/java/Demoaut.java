package demoautnavi.java;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Demoaut {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String url="http://www.newtours.demoaut.com";
		driver.get(url);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int linkcount=links.size();
		System.out.println("total no of links are available of page is:"+linkcount);
	for	(int i=0;i<links.size();i++)
	{
		String linkname=links.get(i).getText();
		System.out.println(i+" "+"name of links is:"+linkname);
	}

	}

}
