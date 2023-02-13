package SeleniumLearning;


import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Xls_Reader;

import java.io.IOException;

public class AT15_ExcelDataUsage {

        @Test
        public void CreateAccounts() throws IOException {

            OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("GGRegPageUrl"));

            //Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\TestDataHN1.xlsx");
            Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+ ReadPropertiesFile.PropFile("ExcelLocation"));
            // count of rows in the excel sheet
            int rowcount= reader.getRowCount("RegTestData");
            System.out.println("rowcount :"+rowcount);
            for(int i=2;i<=rowcount;i++) {
                //FirstName
                String FirstName=  reader.getCellData("RegTestData","FirstName",i);
                System.out.println("FirstName : "+FirstName);
                OpenBrowser.driver.findElement(By.id("regAddForm_firstName")).clear();
                OpenBrowser.driver.findElement(By.id("regAddForm_firstName")).sendKeys(FirstName);
                //Here we picked up data for LastName from excel
                String lastname=reader.getCellData("RegTestData","LastName",i);
                OpenBrowser.driver.findElement(By.id("regAddForm_lastName")).clear();
                OpenBrowser.driver.findElement(By.id("regAddForm_lastName")).sendKeys(lastname);
                //Here we picked up data for Email Address from excel
                String email_address=reader.getCellData("RegTestData","EmailAddress",i);
                OpenBrowser.driver.findElement(By.id("regAddForm_email1")).clear();
                OpenBrowser.driver.findElement(By.id("regAddForm_email1")).sendKeys(email_address);
                //Password
                String password=reader.getCellData("RegTestData","Password",i);
                OpenBrowser.driver.findElement(By.id("regAddForm_password")).clear();
                OpenBrowser.driver.findElement(By.id("regAddForm_password")).sendKeys(password);
                //reenter password
                String confirmation=reader.getCellData("RegTestData","RePassword",i);
                OpenBrowser.driver.findElement(By.id("regAddForm_passwordNew")).clear();
                OpenBrowser.driver.findElement(By.id("regAddForm_passwordNew")).sendKeys(confirmation);
                //Thread.sleep(5000);
                //put data back into excelsheet
                String textName=OpenBrowser.driver.findElement(By.xpath("//h1[contains(text(),'Create an Account')]")).getText();
                reader.setCellData("RegTestData","Result",i,textName);
            }




        }
}
