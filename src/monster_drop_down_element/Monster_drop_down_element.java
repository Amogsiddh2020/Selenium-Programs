package monster_drop_down_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_drop_down_element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String url="https://my.monsterindia.com/sponsered_popup.html";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement country_location=driver.findElement(By.className("border_grey1"));
		Select sel=new Select(country_location);
		sel.selectByIndex(2);
		//sel.selectByValue("Chennai");
		sel.selectByVisibleText("Chennai");
       sel.selectByVisibleText("Solapur");	
       sel.deselectAll();
       
WebElement industry=driver.findElement(By.id("id_industry"));
Select sel1=new Select(industry);
sel1.selectByIndex(1);
sel1.selectByIndex(2);
sel1.selectByVisibleText("any");
	}
	}
