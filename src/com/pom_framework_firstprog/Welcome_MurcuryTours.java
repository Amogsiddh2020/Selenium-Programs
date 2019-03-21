package com.pom_framework_firstprog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Welcome_MurcuryTours {
	// signon-SIGN-ON:selctor of locators:functinality testing
	
	@FindBy(linkText="SIGN-ON")
	
   WebElement signOn;
	
	public void signOn()
	{
		signOn.click();
	}
	
	@FindBy(linkText="REGISTER")
	
	WebElement REGISTER;
	
	public void register()
	{
		REGISTER.click();
	}
	
}
