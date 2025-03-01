package com.myntra.qa.objectRepository;

import org.openqa.selenium.By;

public interface LandingPageProp {
	By MOUSE_OVER_ON_PROFILE=By.xpath("//span[contains(text(),'Profile')]");
	By LOGIN_LINK_LOCATOR=By.xpath("//a[contains(text(),'log in')]");
	By SIGNIN_LINK_LOCATOR=By.xpath("//a[contains(text(),'Sign up')]");
	By MYNTRA_LOGO_lOCATOR=By.xpath("//div[@class='desktop-logoContainer']/a");
	By MOUSE_OVER_ON_MEN=By.xpath("//a[contains(text(),'Men')]");
	By MEN_JEANS_LOCATOR=By.xpath("(//a[contains(text(),'Jeans')])[1]");
	

	
}