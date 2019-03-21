package com.pom_framework_firstprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver=null;
	String url="http://www.newtours.demoaut.com";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	//@Test
	//public void display()
	//{
		//System.out.println("hello");
	//}
	
	/*@AfterTest
	public void dropup()
	{
		//driver.close();
	}*/
	

}
