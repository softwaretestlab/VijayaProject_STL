package SeleniumCucumberCode;
import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT08_CreateAnAccount {
    @Test
    public static void NavToCreateAcc() throws IOException {
        OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("GGRegPageUrl"));
        // implicit wait
        OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public static void EnterAccDetails(String FirstName, String LastName,String EmailAddress){

        OpenBrowser.driver.findElement(By.id("regAddForm_firstName")).clear();
        OpenBrowser.driver.findElement(By.id("regAddForm_firstName")).sendKeys(FirstName);


        OpenBrowser.driver.findElement(By.id("regAddForm_lastName")).clear();
        OpenBrowser.driver.findElement(By.id("regAddForm_lastName")).sendKeys(LastName);


        OpenBrowser.driver.findElement(By.id("regAddForm_email1")).clear();
        OpenBrowser.driver.findElement(By.id("regAddForm_email1")).sendKeys(EmailAddress);

    }
}