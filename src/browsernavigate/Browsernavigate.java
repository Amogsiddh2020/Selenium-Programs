package browsernavigate;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browsernavigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();// TODO Auto-generated method stub
      String url="http://facebook.com";
       d.get(url);
      String s= d.getTitle();
      System.out.println("Title of current URL is:"+s);
      String s1=d.getCurrentUrl();
      System.out.println("current url of page is"+s1);
      String expected="http://www.facebook.com";
      System.out.println("expected results is :"+expected);
      String actual_result=d.getCurrentUrl();
      System.out.println("Actual results is :"+actual_result);
	if(actual_result.equals(expected))
	{
		System.out.println("test case passed");
		}
	else
	{
		System.out.println("test case is failed");
	}
	}

}
