package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;
public class AT03_XpathLearning {

    @Test
    public void xpath() throws InterruptedException {
        //Setting up chromedriver.
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver();
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        // navigate to HN website
        driver.get("https://www.myer.com.au/join");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //enter email address
        //xpath version-1 -- here we rightclicked and copied xpath
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Test@gmail.com");
        //xpath version-2
        driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-co')]")).click();
        //version -3
        //enter password
        driver.findElement(By.xpath("//input[@id='password' and @type='password']")).sendKeys("password");
        Thread.sleep(10000);
        //version - 4
        ////span[contains(text(),'Create account')]
        //scroll to the element
        WebElement CreateAccEle= driver.findElement(By.xpath("//span[contains(text(),'Create account')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CreateAccEle);
        // will stop execution for given timeperiod
        Thread.sleep(20000);


        //version-5
        //click on create an account button
        // CreateAccEle.click();
        //or
        driver.findElement(By.xpath("//*[@id='create-account']")).click();

    }
}