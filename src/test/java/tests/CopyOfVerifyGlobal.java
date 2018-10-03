package tests;

import io.qameta.allure.*;

import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.Logger;

import pages.GlobalPage;
import pages.HomePage;
//import pages.LoginPage;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import utilities.Log;
import utils.ExtentReports.ExtentTestManager;
import utils.Listeners.TestListener;

import java.lang.reflect.Method;

//In order to eliminate attachment problem for Allure, you should add @Listener line.
//link: https://github.com/allure-framework/allure1/issues/730
@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Verify Global Header")
public class CopyOfVerifyGlobal extends BaseTest {
	// Aravind
	/*
	 * public LoginTests(){ LoadConfig(); //Load properties file } //Test Data
	 * /* String wrongUsername = prop.getProperty("wrongUsername"); String
	 * wrongPassword = prop.getProperty("wrongPassword");
	 */

	@Story("Story 1 - Verify Global Header")
	@Test(priority = 0, description = "Verify Global Header")
	@Description("Test Description: Verify Global Header")
	@Severity(SeverityLevel.BLOCKER)
	public void verify_GlobalHeaderMethod(Method method)
			throws InterruptedException {
		Log.info(method.getName() + " test is starting.");

		// ExtentReports Description
		ExtentTestManager.getTest().setDescription(
				"ExtentTestManager_verify OurMergerPage");

		// *************PAGE INSTANTIATIONS*************
		HomePage homePage = new HomePage(prop, driver, wait);
		GlobalPage globalHeader = new GlobalPage(prop, driver, wait);

		// *************PAGE METHODS********************
		// Verify Global Header on Home page
		homePage.goToCortevaHomePage();
		globalHeader.verifyGlobalHeader();

		// Verify Global Header Our Merger Page
		homePage.clickOnWhoWeAre();
		homePage.goOurMergerPage();
		globalHeader.verifyGlobalHeader();

		// Verify Global Header Our Purpose And ValuesPage Page
		homePage.clickOnWhoWeAre();
		homePage.goToOurPurposeAndValuesPage();
		globalHeader.verifyGlobalHeader();
	}

	@Story("Story 1 - Verify Global Footer")
	@Test(priority = 0, description = "Verify Global Footer")
	@Description("Test Description: Verify Global Footer.")
	@Severity(SeverityLevel.BLOCKER)
	public void verify_GlobalFooterMethod(Method method)
			throws InterruptedException {
		Log.info(method.getName() + " test is starting.");

		// ExtentReports Description
		ExtentTestManager.getTest().setDescription(
				"ExtentTestManager_verify OurMergerPage");
		// *************PAGE INSTANTIATIONS*************
		HomePage homePage = new HomePage(prop, driver, wait);
		GlobalPage globalFooter = new GlobalPage(prop, driver, wait);

		// *************PAGE METHODS********************
		// Verify Global Header on Home page
		try {
			homePage.goToCortevaHomePage();
			globalFooter.verifyGlobalFooter();
		} catch (InvalidSelectorException e) {
			e.getMessage();
			//e.printStackTrace();
			//Log.error("footer is invalid");
			//Allure.getLifecycle().fire(new StepFinishedEvent());
		
		}

		try {
			homePage.clickOnWhoWeAre();
			homePage.goOurMergerPage();
			globalFooter.verifyGlobalFooter();
		} catch (InvalidSelectorException e) {
			e.printStackTrace();
		}

		// Verify Global Header Our Purpose And ValuesPage Page
		try {
			homePage.clickOnWhoWeAre();
			homePage.goToOurPurposeAndValuesPage();
			globalFooter.verifyGlobalFooter();
		} catch (InvalidSelectorException e) {
			e.printStackTrace();
		}
	}
}