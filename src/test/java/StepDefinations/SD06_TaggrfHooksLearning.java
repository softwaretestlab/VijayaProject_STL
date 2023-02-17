package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD06_TaggrfHooksLearning {

    @Before("@First")
    public void RunBeforeThirdTest(){
        System.out.println("RunBeforeThirdTest--@Before--@First--taggedhook");
    }
    @After("@First")
    public void RunAfterThirdTest(){
        System.out.println("RunAfterThirdTest--@After--@First--taggedhook");
    }

    @Before("@Second")
    public void RunBeforeFourthTest(){
        System.out.println("RunAfterFourthTest--@Before--@Second--taggedhook");
    }

    @After("@Second")
    public void RunAfterFourthTest(){
        System.out.println("RunAfterFourthTest--@After--@Second--taggedhook");
    }
    //scenario-1
    @Given("this is Third given")
    public void this_is_third_given() {
        System.out.println("Third scenario Given");
    }
    @Then("This is Third then")
    public void this_is_third_then() {
        System.out.println("Third scenario Then");
    }


    //scenario-2
    @Given("this is Fourth given")
    public void this_is_fourth_given() {
        System.out.println("Fourth scenario Given");
    }
    @Then("This is Fourth then")
    public void this_is_fourth_then() {
        System.out.println("Fourth scenario Then");
    }

}