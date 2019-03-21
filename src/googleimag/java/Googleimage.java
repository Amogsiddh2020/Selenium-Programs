package googleimag.java;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
public class Googleimage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String url="http://google.com";
		driver.get(url);
	//	<a class="gb_P" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi">Images</a>
		driver.findElement(By.className("gb_P")).click();
		driver.findElement(By.linkText("Images")).click();

	}

}
