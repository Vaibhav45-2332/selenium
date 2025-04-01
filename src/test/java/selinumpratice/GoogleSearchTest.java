package selinumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://www.google.co.in/");
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("web");
        List<WebElement> list =  driver.findElements(By.xpath("//ancestor::div[@class='UUbT9 EyBRub']//div[@class='aajZCb']//descendant::div/ul[@jsname='bw4e9b']/li"));
        System.out.println("Total no of suggestion " + list.size());

        for (int i=0;i< list.size();i++) {
            System.out.println(list.get(i).getText());
            if(list.get(i).getText().equals("web series")){
                list.get(i).click();
                break;
            }
        }


    }
}
