package timeanddate.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Time_and_Date_WebTable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		
		WebDriver driver=null;
		driver=new ChromeDriver();
		String url="https://www.timeanddate.com/worldclock/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement t=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr"+"[+i+]/td[1]"));
		List<WebElement>rows=t.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			
			for(int k=0;k<cols.size();k++)
			{
				String data=cols.get(k).getText();
				System.out.print(data+ "  ");
			}
		//	/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
			System.out.println();
		}
		driver.quit();

	}

}
