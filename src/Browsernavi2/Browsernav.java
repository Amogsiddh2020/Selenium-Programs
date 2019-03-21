package Browsernavi2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
public class Browsernav {

	public static void main(String[] args) {
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
	driver =new ChromeDriver();
	String s="http://www.facebook.com";
	//String url="http://orangehrm.com";
	driver.get(s);
	driver.findElement(By.id("email")).sendKeys("amol@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("amdu89");
	driver.findElement(By.id("loginbutton")).click();
	
	
		// TODO Auto-generated method stub

	}

}
