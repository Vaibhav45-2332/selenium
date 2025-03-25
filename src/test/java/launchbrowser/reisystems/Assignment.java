package launchbrowser.reisystems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
        WebElement gettext = driver.findElement(By.xpath("//button[@type='button']//div"));
        System.out.println("Text = "+gettext.getText());
        Thread.sleep(3000);
        
//		driver.get("https://www.youtube.com/");
//		Thread.sleep(2000);
//		driver.get("https://www.linkedin.com/");
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
		

	}

}
