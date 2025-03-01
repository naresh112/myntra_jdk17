package com.myntra.qa.steps;

import org.testng.Assert;

import com.myntra.qa.pages.LandingPage;

import io.cucumber.java.en.When;

public class LandingPageStepDef {

	Steps steps;
	public LandingPageStepDef(Steps steps) {
		this.steps=steps;
	}
	@When("verify myntra logo")
	public void verify_myntra_logo() {
	    boolean flag =steps.landing_page.getmyntraLogo();
	   Assert.assertTrue(flag,"logo not displayed");
	}

	@When("verify home page title name as {string}")
	public void verify_home_page_title_name_as(String expectedTitle) {
//	  String actualTitle=steps.landingpage.getMyntraTitle();
//	  Assert.assertEquals(actualTitle, expectedTitle);
	}

	@When("user click on login link")
	public void user_click_on_login_link() {
//		steps.landingpage.clickOnLogIn();
	    
	}


}
