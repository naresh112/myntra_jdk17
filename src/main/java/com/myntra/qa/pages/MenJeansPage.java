package com.myntra.qa.pages;

import org.openqa.selenium.WebDriver;

import com.myntra.qa.objectRepository.MenJeansPageProp;
import com.myntra.qa.utils.WebDriverUtils;

public class MenJeansPage extends WebDriverUtils implements MenJeansPageProp {

	WebDriver driver;
	public MenJeansPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public void getdisplayedJeansCount() {
		
	}
	

}
