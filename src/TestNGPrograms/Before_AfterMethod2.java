package TestNGPrograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_AfterMethod2 
{
	@Test
	 public void applicationLaunch()
	{
		System.out.println("Gmail application launch");
	}
	
	@BeforeMethod
	public void logInMail()
	{
		System.out.println("login mail functionality testing");
	}
    
	@AfterMethod
	
	public void inBox()
	{
		System.out.println("inbox functinality Testing");
	}
	
	@BeforeMethod
	public void composeMail()
	{
		System.out.println("compose functinality testing");
	}
	
}
