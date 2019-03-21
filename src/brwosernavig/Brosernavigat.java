package brwosernavig;
import org.openqa.selenium.chrome.ChromeDriver;
public class Brosernavigat {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		ChromeDriver di=new ChromeDriver();
		di.get("http://facebook.com");
	String s=	di.getCurrentUrl();
System.out.println("current url is:"+s);
String actual_url=di.getCurrentUrl();
System.out.println("actual url is:"+actual_url);
String expected_url="http://google.com";
if(actual_url.contains(expected_url))
{
	System.out.println("test url is matched");
	}
else
{
	System.out.println("test url is failed");
	}
	}

}
