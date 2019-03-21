package TestNGPrograms;

import org.testng.annotations.Test;

public class TestNG_FacebookProgramByPriority 
{
	@Test(priority=2)
	public void facebookLogout()
	{
		System.out.println("checking facebook logout functionality");
	}
     
	@Test(priority=0)
	public void launchingFacebookApplication()
	{
		System.out.println("Launching facebook Application");
	}
	@Test(priority=1)
	public void logInFunctionality()
	{
		System.out.println("checking login functionality of facebook application");
	}
}
