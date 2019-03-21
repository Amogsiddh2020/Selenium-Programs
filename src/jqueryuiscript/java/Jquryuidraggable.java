package jqueryuiscript.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquryuidraggable {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
   WebDriver driver=null;
   driver=new ChromeDriver();
   String url="http://jqueryui.com/droppable/";
   driver.get(url);
   driver.manage().window().maximize();
   driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
   //Thread.sleep(400);
   //id="draggable"
   WebElement drag_element=driver.findElement(By.id("draggable"));
   WebElement drop_element=driver.findElement(By.id("droppable"));
   Actions act=new Actions(driver);
   act.dragAndDrop(drag_element,drop_element).perform();
   driver.switchTo().defaultContent();
   
	}

}
