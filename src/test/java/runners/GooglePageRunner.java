package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//features//GoogleSearch.feature",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				"rerun:target/failed_scenarios.txt",
//				"html:target/reports/HtmlReport.html",
//				"json:target/reports/Report.json",
//				"usage:target/reports/usagereport",
//				"junit:target/reports/junitreport.xml",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		}
		)
public class GooglePageRunner {

	

}
 