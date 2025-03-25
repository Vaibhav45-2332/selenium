package launchbrowser.reisystems;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		// Connect to the actual browser.
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");

		// Up casting-Reference of parent class and Object of child class.
		// control+shift+o
		WebDriver driver = new ChromeDriver(); 
		//browser methods
		driver.get("https://www.youtube.com/"); 
		System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());  
		//System.out.println(driver.getPageSource());
		
		//navigate method
		driver.navigate().to( "https:/www.google.com/");
		//driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.close();
		 
	}

}
