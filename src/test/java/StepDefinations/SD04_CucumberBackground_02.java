package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD04_CucumberBackground_02 {
    @Given("user clicks on account link from homepage-{int}")
    public void user_clicks_on_account_link_from_homepage(Integer int1) {
        System.out.println(" this is Given step in scenario-2");
    }
    @Then("User is navigated to Create an account screen-{int}")
    public void user_is_navigated_to_create_an_account_screen(Integer int1) {
        System.out.println(" this is Then step in scenario-2");
    }
}
