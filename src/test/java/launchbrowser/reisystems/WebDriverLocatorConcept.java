package launchbrowser.reisystems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");

		// Up casting-Reference of parent class and Object of child class.
		// control+shift+o
		WebDriver driver = new ChromeDriver();
		driver.get("https://api.linkedin.com/login");
		driver.manage().window().maximize();

		// 1.xpath
//		 driver.findElement(By.xpath("//*[@id=\"businessName\"]")).sendKeys("vaibhav");
//		 driver.findElement(By.xpath("//*[@id=\"businessEmail\"]")).sendKeys("vaibhavchau2018@gmail.com");
//		 driver.findElement(By.xpath("//*[@id=\"bizPassword\"]")).sendKeys("Vaibhav@12345");
//		 driver.findElement(By.xpath("//*[@id=\"businessCountry\"]")).sendKeys("India");

		// 2.Id
		driver.findElement(By.id("username")).sendKeys("vaibhavchau2018@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Vaibhav@12345");
		driver.findElement(By.xpath("//*[@id=\\\"BUSINESS_REG_FORM_SUBMIT\\\"]")).submit();
		driver.findElement(By.linkText("Sign in")).click();

		// 3.Name
//		 driver.findElement(By.name("businessName")).sendKeys("vaibhav");
//		 driver.findElement(By.name("businessEmail")).sendKeys("vaibhavchau2018@gmail.com");
//		 driver.findElement(By.name("bizPassword")).sendKeys("Vaibhav@12345");
//		 driver.findElement(By.id("businessCountry")).sendKeys("United Kingdom");

		// 4.linktext (use only for links)
		// driver.findElement(By.linkText("Join now")).click();

		// 5.partaillinktext (not that much useful)
		// driver.findElement(By.partialLinkText("Join")).click();

		// 6.Css Selector

		// iver.findElement(By.cssSelector(
		// "#username")).sendKeys("vaibhavchaudhari2018@gmail.com");

		// 7. by class name
		 
	}

}
