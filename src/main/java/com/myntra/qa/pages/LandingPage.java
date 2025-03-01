package com.myntra.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.myntra.qa.objectRepository.LandingPageProp;
import com.myntra.qa.utils.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPageProp{
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public boolean getmyntraLogo() {
		return web_Element(MYNTRA_LOGO_lOCATOR).isDisplayed();
	}
	public String getMyntraTitle() {
		return driver.getTitle();
	}
	public LoginPage clickOnLogIn() {
		mouseOver(MOUSE_OVER_ON_PROFILE);
		click(LOGIN_LINK_LOCATOR);
		return new LoginPage(driver);
		
	}
	public SigninPage clickOnSignin() {
		mouseOver(MOUSE_OVER_ON_PROFILE);
		click(SIGNIN_LINK_LOCATOR);
		return new SigninPage(driver);
	}
	public MenJeansPage clickOnMenJeans() {
		mouseOver(MOUSE_OVER_ON_MEN);
		click(MEN_JEANS_LOCATOR);
		return new MenJeansPage(driver);
	}

}
