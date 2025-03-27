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

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://test8-internal--ktorgn.sandbox.my.salesforce.com/?ec=302&startURL=%2F005%3Ffcf%3D00B4T000003axei%26isUserEntityOverride%3D1%26setupid%3DManageUsers");
	}

	@When("the user enters username {string} and password {string}")
	public void the_user_enters_username_and_password(String string, String string2) {
		validusername = driver.findElement(
				By.xpath("//div[@id='content']//label[text()='Username']//parent::div//input[@type='email']"));//
		validpassword = driver.findElement(By
				.xpath("//label[@for='password']//following-sibling::input[@class='input r4 wide mb16 mt8 password']"));
		validusername.sendKeys("krishnacr7@reisystems.in.ktorgn");
		validpassword.sendKeys("Password@12345");		
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
	}

	@Then("the user should see {string}")
	public void the_user_should_see(String string) {

	}
}
