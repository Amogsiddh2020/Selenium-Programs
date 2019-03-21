package TestNGPrograms;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_After_TestCase1 
{
	@BeforeTest
	 public void applicationLaunch()
	 {
		System.out.println("Launching gmail application");
	 }
  
	@Test(priority=0)
	
	public void logInGmail()
	{
		System.out.println(" Gmail login functinality Testing");
		}
	@Test(priority=2)
	public void inBoxMail()
	{
		System.out.println("inbox functinality testing");
	}
	
	@Test(priority=1)
	public void composeMail()
	{
		System.out.println("compose mail functinality testing");
	}
	
	@AfterTest
	public void close()
	{
		System.out.println("Gmail application is closed");
	}
}
