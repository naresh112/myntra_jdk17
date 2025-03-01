package com.myntra.qa.pages;

import org.openqa.selenium.WebDriver;

import com.myntra.qa.objectRepository.SigninPageProp;
import com.myntra.qa.utils.WebDriverUtils;

public class SigninPage extends WebDriverUtils implements SigninPageProp {

	WebDriver driver;
	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

}
