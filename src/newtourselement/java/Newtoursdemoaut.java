package newtourselement.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtoursdemoaut {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
    WebDriver driver=null;
    driver=new ChromeDriver();
    String url="http://www.newtours.demoaut.com";
    driver.get(url);
    List<WebElement>links=driver.findElements(By.tagName("a"));
    int linkcount=links.size();
    System.out.println("no of links available are :"+linkcount);
    for(int i=0;i<links.size();i++)
    {
    
    if(links.get(i).isDisplayed())
    {
    	String linkname=links.get(i).getText();
    System.out.println(i+":"+"links name are :"+linkname);
    links.get(i).click();
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    System.out.println();
    driver.navigate().back();
    links=driver.findElements(By.tagName("a"));
	}
    }
    driver.manage().window().maximize();
    //driver.quit();
	}

}
