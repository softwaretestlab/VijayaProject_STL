package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD01_LoginTOWebPage {

    @Given("Enter username")
    public void enter_username() {
        System.out.println("Customer has entered username");
    }
    @Then("Enter Password")
    public void enter_password() {
        System.out.println("Customer has entered password");
    }
    @Then("click on login button")
    public void click_on_login_button() {
        System.out.println("Customer has clicked on loginbutton");
    }
    @Then("should be on Account screen")
    public void should_be_on_account_screen() {
        System.out.println("Customer is on Account screen");
    }

}
