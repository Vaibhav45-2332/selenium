package launchbrowser.reisystems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillForm {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fsignin.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F&_trksid=p2487285.m5021.l46827");
		driver.findElement(By.xpath("//label[text()='Business name']//parent::span//span//input")).sendKeys("DummyData");
		driver.findElement(By.xpath("//label[text()='Business email']//parent::span//span//input")).sendKeys("dumydata20002@gmail.com");
		driver.findElement(By.xpath("//label[text()='Password']//parent::span//span//input")).sendKeys("Dumydata@12345");
		Select select = new Select(driver.findElement(By.xpath("//label[text()='Where is your business registered?']//parent::div//following-sibling::span[@class='select select--fluid']//select")));
		select.selectByVisibleText("United States");
		driver.findElement(By.xpath("//label[text()='I’m only interested in buying on eBay for now']//parent::span//input")).click();
		driver.findElement(By.xpath("//button[text()='Create business account']//parent::span")).click();
		int size =driver.findElements(By.xpath("//button[text()='Create business account']//parent::span")).size();
		boolean res=driver.findElement(By.xpath("//label[text()='I’m only interested in buying on eBay for now']//parent::span//input")).isSelected();
        System.out.println(res);
		System.out.println(size);
		Thread.sleep(3000);
		driver.close();
		 

	}

}
