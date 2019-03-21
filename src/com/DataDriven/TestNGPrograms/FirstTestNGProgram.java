package com.DataDriven.TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class FirstTestNGProgram 
{
	
	WebDriver driver=null;
	String url="http://www.google.com";
	
	@BeforeTest
	
	
	public void stup()
	{
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		driver.get(url);
	}
	
	@AfterTest
	public void closeWindow()
	{
		driver.quit();
	}

}
