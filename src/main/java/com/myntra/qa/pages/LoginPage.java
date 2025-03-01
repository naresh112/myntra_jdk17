package com.myntra.qa.pages;

import org.openqa.selenium.WebDriver;

import com.myntra.qa.objectRepository.LoginPageProp;
import com.myntra.qa.utils.WebDriverUtils;

public class LoginPage extends WebDriverUtils implements LoginPageProp {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;	
	}
	

}
