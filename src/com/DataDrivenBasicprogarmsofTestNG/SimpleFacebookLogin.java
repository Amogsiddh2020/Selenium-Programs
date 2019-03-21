package com.DataDrivenBasicprogarmsofTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleFacebookLogin    
{
	WebDriver driver=null;
	String url="http://facebook.com";
	
	@BeforeTest
	public void dropSet()
	{
	
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    }
	
	@Test
	
	public void logINFacebook()
	{
		//email
		driver.findElement(By.name("email")).sendKeys("amogsiddh1992@gmail.com");
		//name="pass"
		driver.findElement(By.name("pass")).sendKeys("amd@1992");
		//id=u_0_2
		driver.findElement(By.id("u_0_2")).click();
	}
	
	
	
	
	@AfterTest
	public void dropClose()
	{
		driver.close();
	}

}
