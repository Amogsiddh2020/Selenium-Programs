package browservalidate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserValidate {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.ex");
		WebDriver driver=null;
		String url="http://facebook.com";
		driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\geckodriver.exe");
		
		driver.get(url);
		String actual_url=driver.getCurrentUrl();
		System.out.println("actual results is :"+actual_url);
		String expected_url="facebook.com";
		if(actual_url.contains(expected_url))
		{
			System.out.println("url is found correctly");
		}
		else
		{
			System.out.println("url is incorrect");
		}
		
		
		// TODO Auto-generated method stub

	}

}
