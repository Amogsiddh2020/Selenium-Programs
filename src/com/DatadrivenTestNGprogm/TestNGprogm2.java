package com.DatadrivenTestNGprogm;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGprogm2 
{
	WebDriver driver=null;
	String url="http://facebook.com";
	
	@BeforeTest
	public void faceboolLaunch()
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
        driver.get(url);
        driver.manage().window().maximize();
	}
	@Test
	public void displayMsg()
	{
		System.out.println("Hello welcome to Test NG second programs");
		System.out.println("welcome to test NG framewok Second programs");
	}
	
	@AfterTest
	public void facebookclose()
	{
		driver.close();
	}

}
