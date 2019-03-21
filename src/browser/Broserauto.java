package browser;
import org.openqa.selenium.chrome.ChromeDriver;
public class Broserauto {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//d.get("http://www.google.com");
		d.navigate().to("http://facebook.com");
		String s=d.getTitle();
		System.out.println("given url title is:"+s);
		String expected="facebook-log in or sign up";
		if(s==expected)
		{
			System.out.println("test case is passed:"+s);
		}
		else
		{
			System.out.println("test case is failed:"+s);
		}
		// TODO Auto-generated method stub

	}

}
