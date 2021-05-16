package runner;

import POM.BaseClass;
import cucumber.api.CucumberOptions;


@CucumberOptions(features = "src/test/java/features",
glue = {"steps"},
plugin = {"pretty", "html:target/cucumber-html-report"}) // create folder called target and add html report on it
public class TestRunner extends BaseClass {

	
	
	
}
