package newtours_dropdown_checkactive_or_not;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_dropdown_check_active_or_not {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
	
	WebDriver driver=null;
	driver=new ChromeDriver();
	String url="http://www.newtours.demoaut.com";
	driver.get(url);
	driver.manage().window().maximize();
 //href=REGISTER
	WebElement register=driver.findElement(By.linkText("REGISTER"));
	register.click();
	//WebElement name="country"
	WebElement country=driver.findElement(By.name("country"));
	List<WebElement>countries=country.findElements(By.tagName("option"));
	int country_count=countries.size();
	System.out.println("no of countries in world is:"+country_count);
	for(int i=0;i<country_count;i++)
	{
		countries.get(i).click();
		if(countries.get(i).isSelected())
		{
			System.out.println("element is active:");
		}
		else
		{
			System.out.println("element is inactive:");
		}
String country_count_Name=countries.get(i).getText();
System.out.println(i+":"+"name of country is :"+country_count_Name);
	}
	}

}
