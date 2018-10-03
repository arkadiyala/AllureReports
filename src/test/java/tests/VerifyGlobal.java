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
public class VerifyGlobal extends BaseTest {
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
		
		
		// Verify Global Header on Leadership Page
		homePage.clickOnWhoWeAre();
		homePage.goToLeadershipPage();
		globalHeader.verifyGlobalHeader();
		
		// Verify Global Header on History Page
		homePage.clickOnWhoWeAre();
		homePage.goToHistoryPage();
		globalHeader.verifyGlobalHeader();
		
		// Verify Global Header on Diversity Page
		homePage.clickOnWhoWeAre();
		homePage.goToDiversityPage();
		globalHeader.verifyGlobalHeader();
		
		// Verify Global Header on Communities Page
		homePage.clickOnWhoWeAre();
		homePage.goToCommunitiesPage();
		globalHeader.verifyGlobalHeader();
		
		// Verify Global Header on Our impact Page
		homePage.clickOnOurImpact();
		homePage.goToOurImpactPage();
		globalHeader.verifyGlobalHeader();
		
		// Verify Global Header on innovation Page
		homePage.clickOnOurImpact();
		homePage.goToInnovationPage();
		globalHeader.verifyGlobalHeader();
		
		// Verify Global Header on Sustainability Page
		homePage.clickOnOurImpact();
		homePage.goToSustainabilityPage();
		globalHeader.verifyGlobalHeader();
		
		// Verify Global Header on Products-and-services Page
		homePage.goToProductsAndServicesPage();
		globalHeader.verifyGlobalHeader();
		
		// Verify Global Header on blog Page
		homePage.goToBlogPage();
		globalHeader.verifyGlobalHeader();
		
		// Verify Global Header on media-center Page
		homePage.goToMediaCenterPage();
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
		// Verify Global Footer on Home page
		try {
			homePage.goToCortevaHomePage();
			globalFooter.verifyGlobalFooter();
		} catch (Exception e) {
			Allure.addAttachment("name-Falied", "Failed-content");
		}

		homePage.clickOnWhoWeAre();
		homePage.goOurMergerPage();
		globalFooter.verifyGlobalFooter();

		// Verify Global Footer on Our Purpose And ValuesPage Page

		homePage.clickOnWhoWeAre();
		homePage.goToOurPurposeAndValuesPage();
		globalFooter.verifyGlobalFooter();

		
		// Verify Global Footer on Leadership Page
		homePage.clickOnWhoWeAre();
		homePage.goToLeadershipPage();
		globalFooter.verifyGlobalFooter();
		
		// Verify Global Footer on History Page
		homePage.clickOnWhoWeAre();
		homePage.goToHistoryPage();
		globalFooter.verifyGlobalFooter();
		
		// Verify Global Footer on Diversity Page
		homePage.clickOnWhoWeAre();
		homePage.goToDiversityPage();
		globalFooter.verifyGlobalFooter();
		
		// Verify Global Footer on Communities Page
		homePage.clickOnWhoWeAre();
		homePage.goToCommunitiesPage();
		globalFooter.verifyGlobalFooter();
		
		// Verify Global Header on Our impact Page
		homePage.clickOnOurImpact();
		homePage.goToOurImpactPage();
		globalFooter.verifyGlobalFooter();
		
		// Verify Global Header on innovation Page
		homePage.clickOnOurImpact();
		homePage.goToInnovationPage();
		globalFooter.verifyGlobalFooter();
		
		// Verify Global Header on Sustainability Page
		homePage.clickOnOurImpact();
		homePage.goToSustainabilityPage();
		globalFooter.verifyGlobalFooter();
		
		// Verify Global Header on Products-and-services Page
		homePage.goToProductsAndServicesPage();
		globalFooter.verifyGlobalFooter();
		
		// Verify Global Header on blog Page
		homePage.goToBlogPage();
		globalFooter.verifyGlobalFooter();
		
		// Verify Global Header on media-center Page
		homePage.goToMediaCenterPage();
		globalFooter.verifyGlobalFooter();
	}
}