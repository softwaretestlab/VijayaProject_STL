package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
public class AT09_DropDownSelect {

    @Test
    public void iframeReg() throws InterruptedException {

        //setup the chromedriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.harveynorman.com.au/hp-envy-x360-15-6-inch-r5-5625u-16gb-512gb-ssd-2-in-1-device.html");
        //Wait few seconds for the page to load
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //parent which are we are going to select
        // this parent will have children as dropdown items in this case this DropDownList will hold
        // all the dropdown items names
        Select DropDownList = new Select(driver.findElement(By.id("select_999999900")));
        // now let get count of children
        int DropDownSize= DropDownList.getOptions().size();
        System.out.println("DropDownSize : "+DropDownSize);
        //First Method
//        for(int i=0;i<DropDownSize;i++){
//            String TxtVal = DropDownList.getOptions().get(i).getText();
//            System.out.println("TxtVal :"+TxtVal);
//            if(TxtVal.equalsIgnoreCase("3 years Product Care Replacement")){
//                DropDownList.getOptions().get(i).click();
//                break;
//
//            }
//
//        }
        //2nd method
      //  DropDownList.selectByVisibleText("2 years Product Care Replacement");

        //3rd method -- this is hardcoding -- not recomended
        //  DropDownList.selectByIndex(3);
    }

}
