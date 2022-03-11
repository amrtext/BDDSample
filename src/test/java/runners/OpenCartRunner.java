package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//features//OpencartLogin.feature",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				//"rerun:target/failed_scenarios.txt",
			    "html:target/reports/HtmlReport.html",
//				"json:target/reports/Report.json",
	              }
				)

public class OpenCartRunner {

}
