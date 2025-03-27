package launchbrowser.reisystems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;


public class LoginFunctionalitySteps {

	WebDriver driver;
	WebElement validusername;
	WebElement validpassword;

	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://test8-internal--ktorgn.sandbox.my.salesforce.com/?ec=302&startURL=%2F005%3Ffcf%3D00B4T000003axei%26isUserEntityOverride%3D1%26setupid%3DManageUsers");
	}

	@When("The user enters <credentials> username {string} and password {string}")
	public void theUserEntersCredentialsUsernameAndPassword(String arg0, String arg1) {
		validusername = driver.findElement(
				By.xpath("//div[@id='content']//label[text()='Username']//parent::div//input[@type='email']"));//
		validpassword = driver.findElement(By
				.xpath("//label[@for='password']//following-sibling::input[@class='input r4 wide mb16 mt8 password']"));
		validusername.sendKeys("krishnacr7@reisystems.in.ktorgn");
		validpassword.sendKeys("Password@12345");
	}

	@And("Clicks on the login button")
	public void clicksOnTheLoginButton() {
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
	}

	@Then("The user should see the <messageType> message  as {string}")
	public void theUserShouldSeeTheMessageTypeMessageAs(String arg0) {
	}


}