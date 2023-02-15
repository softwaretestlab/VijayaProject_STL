package StepDefinations;

import SeleniumCucumberCode.AT01_NavigateToHNwebsite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD01_NavigateToGGWebsite {

    @Given("open browser and enter url and navigate to HN website")
    public void open_browser_and_enter_url_and_navigate_to_hn_website() throws IOException {
        AT01_NavigateToHNwebsite.NavToHN();
    }
    @Then("get title and assert")
    public void get_title_and_assert() {
        AT01_NavigateToHNwebsite.AsserTitle();
    }
}
