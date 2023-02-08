package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features = {"./src/test/java/features/Login.feature"},
			glue = {"step_Definition"},
			dryRun = false
)

public class CucumberRunner extends AbstractTestNGCucumberTests 
{

}
