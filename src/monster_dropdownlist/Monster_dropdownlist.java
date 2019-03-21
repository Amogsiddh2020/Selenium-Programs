package monster_dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_dropdownlist {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
     WebDriver driver=null;
     driver=new ChromeDriver();
     String url="https://my.monsterindia.com/sponsered_popup.html";
     driver.get(url);
     driver.manage().window().maximize();
    WebElement country_location=driver.findElement(By.className("border_grey1"));
    Select selection=new Select(country_location);
    selection.selectByIndex(3);
    selection.selectByVisibleText("Solapur");
    //selection.deselectByVisibleText("Solapur");
    WebElement industry=driver.findElement(By.id("id_industry"));
    Select sel=new Select(industry);
    sel.selectByIndex(1);
    sel.selectByIndex(2);
    sel.selectByIndex(4);
    sel.selectByVisibleText("Mining");
    sel.deselectByIndex(2);
	}
}
