package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD03_CucumberBackground_01 {
    //background
    @Given("use is on homepage")
    public void use_is_on_homepage() {
        System.out.println("This is background method");
    }
    @Given("user clicks on account link from homepage")
    public void user_clicks_on_account_link_from_homepage() {
        System.out.println(" this is Given step in scenario-1");
    }
    @Then("User is navigated to Create an account screen")
    public void user_is_navigated_to_create_an_account_screen() {
        System.out.println(" this is Then step in scenario-1");
    }
}
