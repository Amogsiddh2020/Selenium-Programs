package TestNGPrograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTestNGAnnotations 
{
	@Test
	public void launchingApplication()
	{
		System.out.println("gmail application launching");
		}
         
	  @BeforeMethod
	  public void inBox()
	  {
		  System.out.println("inBox mail functinality testing");
	  }
	  @BeforeMethod
	  public void composeMail()
	  {
		  System.out.println("compose mail functinality testing");
	  }
	  @AfterMethod
	  public void close()
	  {
		  System.out.println("close Gmail application");
	  }
}
