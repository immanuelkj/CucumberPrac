package org.failedtestrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Imm", glue="org\\setpdefinition")

public class FailedTestRunnerClass {

}
