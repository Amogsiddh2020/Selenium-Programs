package com.Browserautomate;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserAutomte {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium Automation programs\\seleniumproj\\driverfiles\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		String url="http://google.com";
		d.get(url);
		d.manage().window().maximize();

	}

}
