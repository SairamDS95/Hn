package org.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources", 
		glue = "org.stepdefnition", 
		dryRun = false, 
		plugin = {"pretty","html:All Reports", "json:All Reports\\JSON\\Report.json", "junit:All Reports\\junit\\report.xml"} , 
		monochrome = true

		)

public class TestRunner {

}
