package SeleniumLearning;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class EnterRegDetials {
    @Test
    public void reg() throws IOException {
        OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("GGRegPageUrl"));
        OpenBrowser.driver.findElement(By.xpath("//*[@id='regAddForm_firstName']")).sendKeys("FirstName");

    }
}