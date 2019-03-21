//Script for automate the newtours.com application login functionality:
package demoaut.javap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoautbasicprog {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String url="http://www.newtours.demoaut.com";
		driver.navigate().to(url);
		//<input type="text" name="userName" size="10">
		driver.findElement(By.name("userName")).sendKeys("amol");
		//<input type="password" name="password" size="10">
		driver.findElement(By.name("password")).sendKeys("mauli123");
		//<input type="image" name="login" value="Login" alt="Login" 
		//border="0" src="/images/forms/submit.gif" width="60" height="23">
driver.findElement(By.name("login")).click();
	}

}
