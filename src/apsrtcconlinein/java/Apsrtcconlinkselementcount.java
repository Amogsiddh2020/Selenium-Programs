package apsrtcconlinein.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apsrtcconlinkselementcount {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
    WebDriver driver=null;
    driver=new ChromeDriver();
    String url="https://apsrtconline.in/oprs-web/";
    driver.get(url);
    driver.manage().window().maximize();
    //<div class="menu-wrap"/>
    WebElement headerblock=driver.findElement(By.className("menu-wrap"));
    List<WebElement>headerlinks=headerblock.findElements(By.tagName("a"));
    int heblck_linkcount=headerlinks.size();
    System.out.println("number of links elements of header blocks is:"+heblck_linkcount);
	for(int i=0;i<heblck_linkcount;i++)
	{
		String heblck_linkname=headerlinks.get(i).getText();
		headerlinks.get(i).click();
		System.out.println("header block link names are:"+heblck_linkname);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
	
	driver.navigate().back();
	Thread.sleep(500);
	headerblock=driver.findElement(By.className("menu-wrap"));
	headerlinks=driver.findElements(By.tagName("a"));
	}	
	driver.quit();
	}
	}
	
