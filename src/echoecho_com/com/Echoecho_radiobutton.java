package echoecho_com.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Echoecho_radiobutton {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
	    WebDriver driver=null;	
	    driver =new ChromeDriver();
	    String url="http://www.echoecho.com/html-forms10.htm";
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
