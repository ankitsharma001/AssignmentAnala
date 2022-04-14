package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/Feature/Assignment1.feature"
		,glue={"StepDefination"}
		)

public class runner {

}
