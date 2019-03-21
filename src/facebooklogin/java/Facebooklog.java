package facebooklogin.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklog {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
     WebDriver driver=null;
     driver=new ChromeDriver();
     String url="http://www.gmail.com";
     driver.get(url);
     //<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
	String email="amogsiddh1992@gamil.com";
	String password="amd861992";
	//<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" spellcheck="false" tabindex="0" 
			//aria-label="Email or phone" name="identifier" autocapitalize="none" id="identifierId" dir="ltr" 	
			//data-initial-dir="ltr" data-initial-value="">
	driver.findElement(By.id("identifierId")).sendKeys("amogsiddh1992@gmail.com");
	//<span class="RveJvd snByac">Next</span>
	driver.findElement(By.className("RveJvd")).click();
//	<input type="password" class="whsOnd zHQkBf" jsname="YPqjbf" 
	//		autocomplete="current-password" spellcheck="false" tabindex="0" 
	//aria-label="Enter your password" name="password" autocapitalize="off" autocorrect="off" 
		//	dir="ltr" data-initial-dir="ltr" data-initial-value="">
	driver.findElement(By.className("password")).sendKeys("amd861992");
	//<span class="RveJvd snByac">Next</span>
	//<span class="RveJvd snByac">Next</span>
	driver.findElement(By.className("RveJvd snByac")).click();
	}

}
