package validatedemaout;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;

public class Validatedemaout {

	public static void main(String[] args) {
		WebDriver driver=null;
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","./seleniumproj//driverfiles//chromedriver.exe");
	String url="http://gmail.com";	
	driver.get(url);
		// TODO Auto-generated method stub

	}

}
