package launchbrowser.reisystems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='prompt-with-default']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		 

	}

}
