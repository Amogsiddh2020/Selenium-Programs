package newtoursloginfunctionality.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtoursloginfunctionality {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
WebDriver driver=null;
driver=new ChromeDriver();
String url="http://www.newtours.demoaut.com";
driver.get(url);
//<input type="text" name="userName" size="10">
driver.findElement(By.name("userName")).sendKeys("tutorial");
//<input type="password" name="password" size="10">
	driver.findElement(By.name("password")).sendKeys("tutorial");
	//<input type="image" name="login" value="Login" 
			//src="/images/btn_signin.gif?osCsid=68f98813fbc43b982bba30e37fc3bc3e" width="58" height="17" 
			//alt="Sign-In" border="0">

	driver.findElement(By.name("login")).click();
	String expected_text="Find";
	System.out.println("expected text is :"+expected_text);
	String actual=driver.getTitle();
	System.out.println("actual text is :"+actual);
	if(actual.contains(expected_text))
	{
		System.out.println("login successful--passed ");
	}
	else
	{
		System.out.println("login unsuccessful---failed");
	}
	//<a href="mercurysignoff.php">SIGN-OFF</a>
	//driver.quit();
	driver.findElement(By.linkText("SIGN-OFF")).click();
	//<a href="mercurysignon.php">SIGN-ON</a>
//	<td class="mouseOut" width="77" height="33" align="center" onmouseout="changeStyle(this, 'mouseOut')" 
		//	onmouseover="changeStyle(this, 'mouseOver')">
	//<a href="mercuryregister.php">REGISTER</a></td>
	driver.findElement(By.linkText("REGISTER")).click();
	//<input maxlength="60" name="firstName" size="20">
	driver.findElement(By.name("firstName")).sendKeys("amol");
	//<input maxlength="60" name="lastName" size="20">
	driver.findElement(By.name("lastName")).sendKeys("deshmukh");
	//<input maxlength="20" name="phone" size="15">
	driver.findElement(By.name("phone")).sendKeys("8956524778");
//	<input name="userName" id="userName" size="35" maxlength="64">
	driver.findElement(By.id("userName")).sendKeys("amogsiddh1992@gamil.com");
	//<input maxlength="60" value="" size="40" name="address2">
	driver.findElement(By.name("address2")).sendKeys("nehru chowk near bus stand mandrup");
	//<input maxlength="60" name="address1" size="40">
	driver.findElement(By.name("address1")).sendKeys("mandrup,tal:south solapur,dis:solapur");
	//<input maxlength="60" name="city" size="15">
	driver.findElement(By.name("city")).sendKeys("mandrup,south solapur,solapur");
//	<input maxlength="40" name="state">
	driver.findElement(By.name("state")).sendKeys("Maharasthra");
	//<input maxlength="20" name="postalCode" size="15">
	driver.findElement(By.name("postalCode")).sendKeys("413221");
	driver.findElement(By.name("country")).sendKeys("India");
	//<input name="email" id="email" size="20" maxlength="60">
	driver.findElement(By.name("email")).sendKeys("amol@gmail.com");
	//<input maxlength="60" name="password" size="20" type="password">
	driver.findElement(By.name("password")).sendKeys("amol@123");
	//<input maxlength="60" name="confirmPassword" size="20" type="password">
	driver.findElement(By.name("confirmPassword")).sendKeys("amol@123");
	
	//<input type="image" name="register" src="/images/forms/submit.gif" width="60" height="23" border="0">
	driver.findElement(By.name("register")).click();
	driver.quit();
	}
}
	