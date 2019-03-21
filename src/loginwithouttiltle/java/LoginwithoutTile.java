package loginwithouttiltle.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class LoginwithoutTile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String url="http://facebook.com";
		driver.get(url);
		String Email="amogsiddha deshmukh";
		String password="amd861992";
		//<input type="email" class="inputtext" 
		//name="email" id="email" data-testid="royal_email">
		
WebElement email=driver.findElement(By.id("email"));
email.sendKeys(Email);
//<input type="password" class="inputtext" 
//name="pass" id="pass" data-testid="royal_pass">
WebElement pass=driver.findElement(By.id("pass"));
pass.sendKeys(password);
//<input value="Log In" aria-label="Log In" 
//data-testid="royal_login_button" type="submit" id="u_0_2">
//<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_3">
WebElement login=driver.findElement(By.id("u_0_2"));
login.click();
String expected_text="welcome";
System.out.println("after login of facebook expected message is:"+expected_text);
WebElement logoutmenu=driver.findElement(By.id("userNavigationLabel"));
String actuallogin=logoutmenu.getText();
System.out.println("atcual text after login is:"+actuallogin);
if(actuallogin.contains(expected_text))
{
	System.out.println("facebook login successful---passed");
	}
else
{
	System.out.println("facebook not logged in successful----failed");
	}
logoutmenu.click();
//<div class="_6qfu _5lxt f_click" id="userNavigationLabel">Account Settings</div>
WebElement logout=driver.findElement(By.id("u_w_5"));
logout.click();
//<span class="_54nh"><form class="_w0d _w0d" action="https://www.facebook.com/login/device-based"

}

}
