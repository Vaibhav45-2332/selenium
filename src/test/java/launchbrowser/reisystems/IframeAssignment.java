//Login as Internal user-Navigate to announcement tab-Navigate to published announcement table-Click on top right button
//New-Use Iframe concept write code for switching to modal window.
package launchbrowser.reisystems;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IframeAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("web-driver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://test8-internal--ktorgn.sandbox.my.salesforce.com/?ec=302&startURL=%2F005%3Ffcf%3D00B4T000003axei%26isUserEntityOverride%3D1%26setupid%3DManageUsers");
		driver.findElement(
				By.xpath("//div[@id='content']//label[text()='Username']//parent::div//input[@type='email']"))
				.sendKeys("krishnacr7@reisystems.in.ktorgn");
		driver.findElement(By
				.xpath("//label[@for='password']//following-sibling::input[@class='input r4 wide mb16 mt8 password']"))
				.sendKeys("Password@12345");
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
		driver.get("https://test8-internal--ktorgn--c.sandbox.vf.force.com/apex/PhaseView?t=FundingOpportunity");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement newButton = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//span//button[@class='secondaryBtn ng-scope ng-binding']")));
		newButton.click();
		driver.switchTo().frame("ActiveFundingOpportunitiesAlliframeContentId");
		 
		driver.findElement(By.xpath("//*[@id=\"j_id0:ModalTemplateId:j_id104:j_id105:componentForm:j_id160\"]"))
				.click();
		Thread.sleep(3000);
		 

	}

}
