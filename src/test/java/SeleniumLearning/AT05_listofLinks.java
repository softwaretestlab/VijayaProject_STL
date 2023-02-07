package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class AT05_listofLinks {
    @Test
    public void linkList() throws IOException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Navigate to HN website
        driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       List<WebElement> ListofLinks = driver.findElements(By.tagName("a"));

        // count
        int LinksCount= ListofLinks.size();
        System.out.println("ListOfLinks : " + LinksCount);
        for(int i=0;i<LinksCount;i++){
            String LinkName = ListofLinks.get(i).getText();
            System.out.println("LinkName : "+ LinkName);
            if(LinkName.equalsIgnoreCase("LatitudePay")){
                ListofLinks.get(i).click();
                break;
            }
        }
    }

}
