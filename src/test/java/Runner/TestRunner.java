package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\java\\FeatureFile"},
        glue = {"StepDefinations"},
        plugin={"pretty:STDOUT","html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "rerun:target/rerun.txt"},
        tags ="@Regression and @Smoke"
     //   tags ="@Regression or @SecondScenario"
// tags ="@RegressionTesting or  @SecondScenario" -- will run both regressionTesting scenarios
        //     and SecondScenario
        // tags ="@RegressionTesting and @SecondScenario" -- will run only scenarios which have
        // a combination of regressionTesting scenarios and SecondScenario
)
public class TestRunner {
}