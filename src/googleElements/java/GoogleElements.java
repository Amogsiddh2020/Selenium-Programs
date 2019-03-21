package googleElements.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
	WebDriver driver=null;
	driver=new ChromeDriver();
	String url="http://www.google.com";
	driver.get(url);
	//<a class="gb_P" data-pid="23" href="https://mail.google.com/mail/?tab=wm">Gmail</a>
//driver.findElement(By.className("gb_P")).click();
//<a class="gb_P" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi">Images</a>
//driver.findElement(By.className("gb_P")).click();
driver.findElement(By.linkText("Images")).click();
WebElement imageelement=driver.findElement(By.linkText("Images"));
//String imageelementText=imageelement.getText();
String imageelementtext=driver.findElement(By.linkText("Images")).getText();
System.out.println("image elements text is :"+imageelementtext);
//driver.quit();
	

	}

}
