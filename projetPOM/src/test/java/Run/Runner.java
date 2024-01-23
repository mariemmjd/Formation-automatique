package Run;

import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags="",
		features="",
		glue="",
		publish=true,
		
		  plugin= {
				"pretty",
				"html:target/cucumber-report.html",
				"json:target/cucumber-report.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	
		
		)

public class Runner {
	

}
