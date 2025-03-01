package com.myntra.qa.objectRepository;

import org.openqa.selenium.By;

public interface SigninPageProp {
	By EMAIL_BX_LOCATOR=By.xpath("//input[@type='email']/..");
	By PASSWORD_LOCATOR=By.xpath("//input[@type='password']/..");
	By LOGIN_BTN=By.xpath("//button[contains(text(),'Log in')]");
	
}
