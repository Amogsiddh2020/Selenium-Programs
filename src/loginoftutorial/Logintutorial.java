package loginoftutorial;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Logintutorial {

	public static void main(String[] args) {
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
driver=new ChromeDriver();    
String url="http://www.flipcart.com";
    driver.get(url);
    String actual_url=driver.getCurrentUrl();
    System.out.println("actual url is :"+actual_url);
    String expected_url="flipkart.com";
    if(actual_url.contains(expected_url))
    {
    	System.out.println("url matched -passed");
    	
    }
    else
    {
    	System.out.println("url not matched-failed");
    }
    driver.findElement(By.tagName("a")).click();
    driver.findElement(By.tagName("text")).sendKeys("amol@1992.com");
    driver.findElement(By.tagName("text")).sendKeys("amol");
    driver.findElement(By.tagName("button")).click();
    
    //driver.findElement(By.id("serachIndexForm")).sendKeys("html5");
	}

}
