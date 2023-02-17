package StepDefinations;

import SeleniumCucumberCode.AT08_CreateAnAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD08_DDTUsingCucumber_CreateAcc {
    @Given("user navigates to Create and account screen")
    public void user_navigates_to_create_and_account_screen() throws IOException {
        AT08_CreateAnAccount.NavToCreateAcc();
    }
    @Then("enter data {string},{string},{string}")
    public void enter_data(String FirstName, String LastName, String EmailAddress) {
        AT08_CreateAnAccount.EnterAccDetails( FirstName,LastName,EmailAddress);
    }
}
