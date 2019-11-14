package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org\\setpdefinition", monochrome=true, dryRun=false, plugin = {"pretty", "html:target", "json:taget/report.jason", "rerun:target/fail.txt"} )
public class TestRunnerClass {

		//plugin = {"pretty", "html:taget", "json:target/report.json"}
}
