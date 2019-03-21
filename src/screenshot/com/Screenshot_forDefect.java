package screenshot.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class Screenshot_forDefect {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
	    WebDriver driver=null;
	    driver=new ChromeDriver();
	    String url="http://bing.com";
	    driver.get(url);
	    Thread.sleep(10000);
	    driver.manage().window().maximize();
	    File ab=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   // FileUtils.copyFile(ab.nnewFile("./screenshot/bing1/.png"));
	    FileUtils.copyFile(ab,new File("./screenshot/bing1.png"));
	    
	    }


}
