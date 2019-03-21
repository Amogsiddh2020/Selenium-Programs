package com.DatadrivenTestNGprogm;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGpro1 
{
	WebDriver driver=null;
	String url="http://google.com";
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void printMsg()
	{
		System.out.println("hello i am in google program1:");
		System.out.println("welcome to Test NG framework:");
	}
	
	@AfterTest
	public void dropUp()
	{
		driver.close();
	}

}
