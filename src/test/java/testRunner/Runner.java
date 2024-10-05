package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src\\test\\java\\features\\login.feature"},
		dryRun = true,
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		glue = "stepDefinition")

public class Runner extends AbstractTestNGCucumberTests{

}
