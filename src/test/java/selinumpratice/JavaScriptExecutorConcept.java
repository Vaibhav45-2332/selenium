package selinumpratice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class JavaScriptExecutorConcept {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://test8-internal--ktorgn.sandbox.my.salesforce.com/?ec=302&startURL=%2F005%3Ffcf%3D00B4T000003axei%26isUserEntityOverride%3D1%26setupid%3DManageUsers");

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@id='content']//label[text()='Username']//parent::div//input[@type='email']")))
                .sendKeys("krishnacr7@reisystems.in.ktorgn");
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//label[@for='password']//following-sibling::input[@class='input r4 wide mb16 mt8 password']")))
                .sendKeys("Password@12345");
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='button r4 wide primary']"))).click();
     WebElement loginbtn = driver.findElement(By.xpath("//input[@class='button r4 wide primary']"));
     flash(loginbtn, driver); //highlighting the specific element
        drawborder(loginbtn,driver);//for draw the border to specific element
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("E:\\Automation\\reisystems\\src\\test\\java\\selinumpratice/elements.png"));
        generatealert(driver ,"There is something issue");
        driver.switchTo().alert().accept();

    }
    public static void flash(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String bgcolor = element.getCssValue("backgroundcolor");
        for(int i=0; i<5; i++) {
            changeColor("rgb(0,0,0)", element, driver);
            changeColor(bgcolor, element, driver);
        }
    }
    public static void changeColor(String color,WebElement element,WebDriver driver )	{
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);

        try {
            Thread.sleep(300);
        }
        catch (InterruptedException e) {
        }
    }
    public static void drawborder(WebElement element, WebDriver driver){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border='3px solid red'",element);
    }
    public static  void generatealert(WebDriver driver, String message){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("alert('"+message+"')");

    }


}
