package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP\\Documents\\Study\\Programming\\SeleniumWithCucumber\\src\\test\\java\\features",
        glue = {"stepDefinition"},
       plugin = {"testng", "html:target/cucumber-report/cucumber.html",
        "json:target/cucumber-report/cucumber.json",
        "junit:target/cucumber-report/cucumber.xml"},
        monochrome = true, publish = true, stepNotifications = true)
public class TestRunner {
}
