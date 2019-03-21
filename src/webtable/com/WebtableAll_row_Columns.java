package webtable.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableAll_row_Columns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
     WebDriver driver=null;
     driver=new ChromeDriver();
     String url="https://www.timeanddate.com/worldclock/";
     driver.get(url);
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     for(int i=1;i<=36;i++)
     {
    	 for(int j=1;j<=8;j++)
    	 {
    String	data=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr"+" [i]/td["+j+"]")).getText();
    	// System.out.print("Web Table details is: "+data);
    System.out.println("Table details is: "+data+ " ");
    	 }
    	 System.out.println();
     }
     //driver.quit();
	}

}
