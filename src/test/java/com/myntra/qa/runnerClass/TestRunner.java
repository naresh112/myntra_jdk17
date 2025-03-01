package com.myntra.qa.runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features", glue="com.myntra.qa.steps",tags = "@verifytitle", 
		dryRun = false,
	    plugin = {"json:target/cucumber/CucumberTestReport.json", 
						"pretty",
						"html:target/cucumber/cucumber-pretty", 
						"rerun:target/cucumber/rerun.txt",
						"usage:target/cucumber/usage.json",
			            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class TestRunner  extends AbstractTestNGCucumberTests{

}
