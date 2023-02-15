package SeleniumCucumberCode;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateToHNwebsite {
    @Test
    public  static void NavToHN() throws IOException {
        OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("HomePageUrl"));
        // implicit wait
        OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void AsserTitle(){
        String ActualTitle= OpenBrowser.driver.getTitle();
        System.out.println("ActualTitle : "+ActualTitle);
        String ExpectedTitle="The Good Guys - Online Electrical & Home Appliances";
        //Assertion version-1
        Assert.assertEquals(ExpectedTitle,ActualTitle);

    }
}
