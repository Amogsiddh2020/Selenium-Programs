package com.DataDrivenBasicprogarmsofTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleprogFacebookAppLaunching 
{
	WebDriver driver=null;
	
	String url="http://facebook.com";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void operations()
	{
		System.out.println("welcome to livetech");
	}
	
	@AfterTest
	public void dropUp()
	{
		driver.close();
	}

}
