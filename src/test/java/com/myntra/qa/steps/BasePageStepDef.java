package com.myntra.qa.steps;

import java.net.MalformedURLException;

import com.myntra.qa.basePage.MyntraTestBasePage;
import com.myntra.qa.pages.LandingPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BasePageStepDef {
	MyntraTestBasePage basePage;
	Steps steps;
	public BasePageStepDef(Steps steps) {
		this.steps=steps;	
		MyntraTestBasePage pageBase =new MyntraTestBasePage();
		steps.testbase = pageBase;
	}
	@Given("user launch browser")
	public void user_launch_browser() throws MalformedURLException {
	    steps.testbase.intilizeDriver();
	}
	@When("user enters URL")
	public void user_enters_URL() {
		LandingPage lapge= steps.testbase.enterURL();
		steps.landing_page=lapge;
	}
	@When("clouse browser")
	public void clouseBrowser() {
		steps.testbase.closeBrowser();
	}

}
