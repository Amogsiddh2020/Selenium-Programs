package TestNGPrograms;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeandAfter_TestCase 
{
	@BeforeTest
	public void getBeforeTest()
	{
		System.out.println("Gmail application launch");
		}
	
	@Test(priority=0)
	
	public void logMail()
	{
		System.out.println("LOgIn mail functinality testing");
	}
	@Test(priority=1)
	
	public void inBox()
	{
		System.out.println("inbox mail functinality testing");
	}
	
	@AfterTest
	public void draft()
	{
		System.out.println("draft functinality testing");
		
	}

}
