package TestNGPrograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Before_AfterMethods3 
{
	@BeforeTest
	public void applicationLaunch()
	{
		System.out.println("Gmail application launch");
	}
	
	@BeforeMethod
	public void inBox()
	{
		System.out.println("inbox functionality testing");
	}
	
	
	
	@BeforeMethod
	public void draftMail()
	{
		System.out.println("draft mail functinality testing");
	}
	
	@AfterMethod
	public void composeMail()
	{
		System.out.println("compose mail functinality of Gmail");
	}
	
	@AfterTest
	public void close()
	{
		System.out.println("close gmail application");
	}

}
