package googlefindelement.java;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Googlefindelemnt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String url="http://www.google.com";
		driver.get(url);
		WebElement imageelement=driver.findElement(By.linkText("Images"));
     String imageelementText=imageelement.getText();
     //String imageelementText.findElement(By.linkText("Images")).getText();
     System.out.println("text of image elemnt is:"+imageelementText);
     driver.findElement(By.linkText("Images")).click();
	driver.quit();
	}	
}


