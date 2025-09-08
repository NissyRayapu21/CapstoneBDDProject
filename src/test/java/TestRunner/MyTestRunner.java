package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/Features/homepage.feature"},		
    glue = {"StepDefinitions","Hooks"},
    tags = "@Regression",
    		plugin = {
    			    "pretty",
    			    "json:target/cucumber.json",
    			    "html:target/cucumber-reports.html",
    			    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    			}
)
public class MyTestRunner extends AbstractTestNGCucumberTests {
}
