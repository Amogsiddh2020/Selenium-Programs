package TestNGPrograms;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BeforeAfterMethods 
{
	@BeforeTest
	public void applicationLaunch()
	{
		System.out.println("gmail application launch");
	}
	
	@BeforeMethod
	public void logInGmail()
	{
		System.out.println("login gmail application testing");
	}
	
	@BeforeMethod
	public void composeMail()
	{
		System.out.println("compose mail functionality testing");
	}
	@BeforeMethod
	public void draftMail()
	{
		System.out.println("draft mail functinality testing");
	}
	
	@AfterTest
	public void close()
	{
		System.out.println("closing Gmail application");
	}

}
