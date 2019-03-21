package noukaripagelinkelemnt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukripagelinklemnt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String url="http://www.naukri.com";
		driver.get(url);
		List<WebElement>achorlinks=driver.findElements(By.tagName("a"));
		int linkcount=achorlinks.size();
		System.out.println("total no of links is:"+linkcount);
		for(int i=0;i<achorlinks.size();i++)
		{
			if(achorlinks.get(i).isDisplayed())
			{
			String linksname=achorlinks.get(i).getText();
			System.out.println(i+":"+"name of links is:"+linksname);
		}
		}
		driver.quit();

	}

}
