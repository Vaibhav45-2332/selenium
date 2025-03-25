package launchbrowser.reisystems;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlingAssignment {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       
        WebDriverWait wait = new WebDriverWait(driver, 10);

         
        driver.get("https://test8-internal--ktorgn.sandbox.my.salesforce.com/?ec=302&startURL=%2F005%3Ffcf%3D00B4T000003axei%26isUserEntityOverride%3D1%26setupid%3DManageUsers");

       
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@id='content']//label[text()='Username']//parent::div//input[@type='email']")))
                .sendKeys("krishnacr7@reisystems.in.ktorgn");

        
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//label[@for='password']//following-sibling::input[@class='input r4 wide mb16 mt8 password']")))
                .sendKeys("Password@12345");

         
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='button r4 wide primary']"))).click();
        
        driver.get("https://test8-internal--ktorgn--c.sandbox.vf.force.com/apex/AnnouncementView?id=a1bDj000001QLHrIAO&RefreshBehaviour=null&TableName=ActiveFundingOpportunitiesAll&TableType=flextable&retURL=%2Fapex%2Fc__PhaseView%3Ft%3DFundingOpportunity");

        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='tab-inner-content']")));

         
        String announcementWindow = driver.getWindowHandle();
        System.out.println("Announcement Window ID "+ announcementWindow);

         
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='tab-inner-content']//a[@href='/a37Dj000000CyE7IAK']"))).click();
  
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> iterator = allWindows.iterator();

         
        while (iterator.hasNext()) {
            String programIdWindow = iterator.next();
            if (!announcementWindow.equalsIgnoreCase(programIdWindow)) {
                driver.switchTo().window(programIdWindow);
                System.out.println("Program window ID " + programIdWindow);
                
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"a1N7A000000m6lbUAAtab\"]")));
                System.out.println("Switched to new window: " + driver.getTitle());
                // Click on the element in the new window
                driver.findElement(By.xpath("//*[@id=\"a1N7A000000m6lbUAAtab\"]")).click();
            }
        }       
                  Thread.sleep(5000);
        
            driver.switchTo().window(announcementWindow);
            System.out.println("Switched to parent window : " + driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }
}
