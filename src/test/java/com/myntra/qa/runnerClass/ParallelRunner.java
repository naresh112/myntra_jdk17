package com.myntra.qa.runnerClass;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features", glue="com.myntra.qa.steps",tags = "@verifytitle", 
		plugin = {"json:target/cucumber/CucumberTestReport.json", 
				"pretty",
				"html:target/cucumber/cucumber-pretty", 
				"rerun:target/cucumber/rerun.txt",
				"usage:target/cucumber/usage.json",
	            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} )

public class ParallelRunner extends AbstractTestNGCucumberTests  {
	@Override
	   @DataProvider(parallel = true)
	   public Object[][] scenarios() {
	   return super.scenarios();
	   }

}
