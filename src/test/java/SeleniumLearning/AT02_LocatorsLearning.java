package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AT02_LocatorsLearning {
    @Test
    public void LocatorsSelenium() {
        //chromedriver setup
        WebDriverManager.chromedriver().setup();
        //This below line will open chrome browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        // navigate to webpage
        driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //By ID
        driver.findElement(By.id("regAddForm_firstName")).sendKeys("Vijaya");
        //By Name
        driver.findElement(By.name("lastName")).sendKeys("AutoamtionLearning");
        //By LinkText
      //  driver.findElement(By.linkText("Catalogues")).click();
        //By Partial Linktext
        driver.findElement(By.partialLinkText("Catalo")).click();

    }
}
