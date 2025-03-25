package launchbrowser.reisystems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionalitySteps {

	WebDriver driver;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
			"https://test8-internal--ktorgn.sandbox.my.salesforce.com/?ec=302&startURL=%2F005%3Ffcf%3D00B4T000003axei%26isUserEntityOverride%3D1%26setupid%3DManageUsers");
	}

	@When("the user enters username {string} and password {string}")
	public void the_user_enters_username_and_password(String string, String string2) {
	     
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	     
	}

	@Then("the user should see {string}")
	public void the_user_should_see(String string) {
		
	}
}
//	@Given("User is on the Login page")
//	public void user_is_on_the_login_page() {
//		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(
//				"https://test8-internal--ktorgn.sandbox.my.salesforce.com/?ec=302&startURL=%2F005%3Ffcf%3D00B4T000003axei%26isUserEntityOverride%3D1%26setupid%3DManageUsers");
//	}
//	@When("user enter a valid {string} and {string}")
//	public void user_enter_a_valid_and(String string, String string2) {
//		driver.findElement(
//			By.xpath("//div[@id='content']//label[text()='Username']//parent::div//input[@type='email']")).sendKeys("krishnacr7@reisystems.in.ktorgn");
//		driver.findElement(By
//				.xpath("//label[@for='password']//following-sibling::input[@class='input r4 wide mb16 mt8 password']")).sendKeys("Password@12345");
//	}
//	@And("click on login button")
//	public void click_on_login_button() {
//		 driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();	 
//	}
//	@Then("user should be redirected to the home page")
//	public void user_redirected_to_the_home_page() {
//	}
