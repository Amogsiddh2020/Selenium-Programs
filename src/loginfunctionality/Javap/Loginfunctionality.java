package loginfunctionality.Javap;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
public class Loginfunctionality {

	public static void main(String[] args) {
		//FirefoxDriver d=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		
//driver.get("http://facebook.com");		// TODO Auto-generated method stub

	}

}
