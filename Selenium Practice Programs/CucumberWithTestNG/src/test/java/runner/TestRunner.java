package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//java//features",
        glue = "stepDefinition",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
                "json:target/cucumber-report/cucumber.json",
                "junit:target/cucumber-report/cucumber.xml"},
        dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
