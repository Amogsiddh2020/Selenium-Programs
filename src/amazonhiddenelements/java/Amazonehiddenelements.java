package amazonhiddenelements.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonehiddenelements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String url="http://www.amazon.in";
		driver.get(url);
		driver.manage().window().maximize();
		//driver.quit();
		
WebElement hellosignIn=driver.findElement(By.id("nav-link-yourAccount"));
Actions acit=new Actions(driver);
acit.moveToElement(hellosignIn).perform();
Thread.sleep(2000);
driver.findElement(By.linkText("your Orders")).click();
	}

}
