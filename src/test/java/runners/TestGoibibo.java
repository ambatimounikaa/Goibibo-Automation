package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"src/test/resources/features/GoibiboPage.feature"}, 
        glue= {"stepDefinitions"},
        plugin= {"pretty","html:target/cucumber-reports"},
        //json:target/cucumber-reports/Cucumber.json - Cucumber JSON report
        //junit:target/cucumber-reports/Cucumber.xml - Cucumber JUnit XML report
        monochrome=true)
public class TestGoibibo {
	
}