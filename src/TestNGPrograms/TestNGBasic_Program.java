package TestNGPrograms;

import org.testng.annotations.Test;

public class TestNGBasic_Program 
{
	@Test
	public void facebooLaunch()
	{
		System.out.println("Launching the facebook Application");
		
	}
	
	@Test
	 public void facebookLoginUser()
	 {
		System.out.println("checking the facebook login functionality of users");
	 }
	
	@Test
	public void facebookLogOutUser()
	{
		System.out.println("checking of facebook logout functionality");
	}
	@Test
	public void sendRequestFunctionality()
	{
		System.out.println("checking the send request functionality of facebook application");
	}

}
