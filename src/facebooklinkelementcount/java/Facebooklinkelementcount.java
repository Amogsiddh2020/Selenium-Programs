package facebooklinkelementcount.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklinkelementcount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String url="http://www.google.com";
		driver.get(url);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int linkcount=links.size();
		System.out.println("total no of links on google page is:"+linkcount);
		for(int i=0;i<links.size();i++)
		{
			String linkname=links.get(i).getText();
			System.out.println(i+":"+"name of links is:"+linkname);
		}

driver.quit();	}

}
