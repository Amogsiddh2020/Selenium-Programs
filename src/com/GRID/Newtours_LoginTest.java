package com.GRID;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Newtours_LoginTest {
	
@Parameters("Browser")
@Test
public void login(String browser) throws IOException
{
	System.out.println("browser name:"+browser);
	DesiredCapabilities cap=null;
	
	if(browser.equals("chrome"))
	{
		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
	}
	
	else if(browser.equals("firefox"))
	{
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
	}
	
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://10.20.0.144:4444/wd/hub"),cap);
	
	String url="http://newtours.demoaut.com";
   driver.get(url);
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   //name="userName"
   driver.findElement(By.name("userName")).sendKeys("tutorial");
   //name="password"
   driver.findElement(By.name("password")).sendKeys("Tutorial");
  // name="login"
driver.findElement(By.name("login")).click();
}

}
