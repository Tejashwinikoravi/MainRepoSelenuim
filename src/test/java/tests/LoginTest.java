package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base
{
	org.apache.logging.log4j.Logger log;
	WebDriver driver;
	@Test()
	public void login() throws IOException, InterruptedException
	{
	 log= LogManager.getLogger(LoginTest.class.getName());
	 log.debug("launchinf browser");
		 driver=initializeDriver();
		 log.debug("launchinf url");

		 driver.get(prop.getProperty("url"));
		 log.debug("navigating to landing page");

		 LandingPage landingpage=new LandingPage(driver);
		 log.debug("click on Login");

		 landingpage.myAccountDropdown().click();
		 landingpage.loginOption().click();
		 Thread.sleep(3000);
		 LoginPage loginPage=new LoginPage(driver);
		 log.debug("enter username");

		 loginPage.emailAddressTextField().sendKeys(prop.getProperty("email"));
		 log.debug("enter Pwd");

		 loginPage.passwordField().sendKeys(prop.getProperty("pwd"));
		 loginPage.loginButton().click();
		  Thread.sleep(1000);
		 
		  
		  
	}

	

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}

	

