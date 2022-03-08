package runner;

import cucumber.api.testng.CucumberFeatureWrapper;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.*;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


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

        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
            return super.scenarios();
        }
/*
    private TestNGCucumberRunner testNGCucumberRunner ;

    @BeforeClass
    public void setUpCucumber(){
        System.out.println("Before class");
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
//7566419198
    @Test(groups = "cucumber", dataProvider = "scenarios")
    public void feature(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    @DataProvider
    public Object[][] scenarios() {
        int i =0 ;
        if (testNGCucumberRunner == null) {
            return new Object[0][0];
        }

        System.out.println(i+". "+testNGCucumberRunner.provideScenarios().getClass());
        i++;
        return testNGCucumberRunner.provideScenarios();
    }

 */
}
