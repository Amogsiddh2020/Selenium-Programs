package com.pom_framework_firstprog;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class NewTours_HomePage extends BaseTest  {
	//private WebDriver driver;

	//private WebDriver driver;

	//private WebDriver driver;
	@Test
	public void homepage()
	{
	//WebDriver driver = null;
		//Welcome_MurcuryTours wt=PageFactory.initElements(driver,Welcome_MurcuryTours.class);
		Welcome_MurcuryTours wt=PageFactory.initElements(driver, Welcome_MurcuryTours.class);
	wt.signOn();
	driver.navigate().back();
	wt.register();
	
	}
	}
