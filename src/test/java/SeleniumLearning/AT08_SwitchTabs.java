package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class AT08_SwitchTabs {
    @Test
    public void SwitchTabLearn() throws InterruptedException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        //Navigate to HN website
        driver.get("https://www.harveynorman.com.au/customer/account/login");
        //click on CustomiseMe, new tab will open
        Thread.sleep(5000);
        //click on CustomiseMe
        driver.findElement(By.cssSelector("a[title^='CustomiseMe']")).click();
        //refresh page
        driver.navigate().refresh();
        Thread.sleep(5000);
        //take all tabs into ArrayList
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //Get count of tabs
        int tabSize=tabs.size();
        System.out.println("tabs count : "+ tabSize);
        for(int i=0; i<tabSize;i++){
            //switch to first tab
            driver.switchTo().window(tabs.get(i)); //it will switch to main tab
            break;
        }

    }
}
