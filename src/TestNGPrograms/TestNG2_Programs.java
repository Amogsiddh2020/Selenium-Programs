package TestNGPrograms;

import org.testng.annotations.Test;

public class TestNG2_Programs {
	@Test(priority=2)
	public void gmailApplicationLaunch()
	{
		System.out.println("Gmail application launch");
	}

	@Test(priority=0)
	public void inboxOfGmail()
	{
		System.out.println("inbox functionality of gmail application testing");
	}
    
	
	@Test(priority=2)
     public void sentMailApplication()
     {
    	 System.out.println("sent mail  functinality of gmail functinality");
     }
    
	
	@Test(priority=1)
     public void gmailUrlApplication()
     {
    	 System.out.println("url of gmail application");
     }
}
