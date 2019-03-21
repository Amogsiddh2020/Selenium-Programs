package googlepage.java;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
public class Googlepage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String url="http://www.google.com";
		driver.get(url);
		
		//<a class="gb_P" data-pid="23" href="https://mail.google.com/mail/?tab=wm">Gmail</a>
	
	//driver.findElement(By.id("gb_70")).click();
	//driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.partialLinkText("Sign")).click();
	}

}
