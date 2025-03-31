package selinumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HeadlessBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");
        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(java.util.logging.Level.OFF);

        WebDriver driver= new HtmlUnitDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://test8-internal--ktorgn.sandbox.my.salesforce.com/?ec=302&startURL=%2F005%3Ffcf%3D00B4T000003axei%26isUserEntityOverride%3D1%26setupid%3DManageUsers");
        System.out.println(driver.getTitle());

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@id='content']//label[text()='Username']//parent::div//input[@type='email']")))
                .sendKeys("krishnacr7@reisystems.in.ktorgn");


        wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//label[@for='password']//following-sibling::input[@class='input r4 wide mb16 mt8 password']")))
                .sendKeys("Password@12345");


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='button r4 wide primary']"))).click();
        System.out.println( driver.getTitle());


    }
}
