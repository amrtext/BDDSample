package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "@target/failed_scenarios.txt",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				"rerun:target/failed_scenarios.txt"})
public class RerubRunner {

	
	
	
}
