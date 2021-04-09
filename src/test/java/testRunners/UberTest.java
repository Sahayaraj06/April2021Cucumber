package testRunners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/appFeature/Uber.feature"},
		glue = {"stepDefinitions"},
		tags = "@Regression or @Smoke",
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				 			"junit:target/MyReports/report.xml"},
		dryRun = true,
		strict = true,
		monochrome = true,
		publish = true
		)
public class UberTest {

}
