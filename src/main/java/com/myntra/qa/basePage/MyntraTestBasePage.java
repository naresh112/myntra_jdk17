package com.myntra.qa.basePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.myntra.qa.pages.LandingPage;

public class MyntraTestBasePage {

	private Properties prop;
	private WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	public MyntraTestBasePage() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(projectPath + "/PropertiesFile/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public WebDriver intilizeDriver() throws MalformedURLException {
		String browserType = System.getProperty("BrowserType");
		if(browserType==null) {
			browserType = prop.getProperty("browserEnvType");
		}
		if (prop.getProperty("browser").equals("chrome")) {
			if (browserType.equals("remote")) {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setBrowserName("chrome");
				caps.setPlatform(Platform.WIN10);
				driver = new RemoteWebDriver(new URL("http://172.20.64.1:4444/wd/hub"), caps);
			} else {
				driver = new ChromeDriver();
			}
		} else if (prop.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (prop.getProperty("browser").equals("internetExplorer")) {
			System.out.println(prop.getProperty("browser"));
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public LandingPage enterURL() {
		driver.get(prop.getProperty("url_test_env"));
		return new LandingPage(driver);

	}

	public void closeBrowser() {
		driver.quit();
		
	}

}
