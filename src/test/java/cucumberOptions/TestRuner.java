package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/java/features",
 glue={"stepDefinition"},
 dryRun = false,
 strict = true,
 monochrome = false,
 //tags={"@smoke,@regression"}
 plugin = { "json:target/cucumber.json","html:target/cucumber-reports" }
 )
public class TestRuner extends AbstractTestNGCucumberTests {

}
