package tests;

import io.qameta.allure.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

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
@Feature("Login Tests")
public class NavigationTests extends BaseTest {
	
	
	//Aravind
	/*
	public LoginTests(){
		LoadConfig(); //Load properties file
	}
    //Test Data
	/*
    String wrongUsername = prop.getProperty("wrongUsername");
    String wrongPassword = prop.getProperty("wrongPassword");
    */
	
	@Story("Story 1 - Home page Navigation")
    @Test (priority = 0, description="Verify home page navigation through links")
    @Description("Test Description: Verify home page navigation through links.")
	@Severity(SeverityLevel.BLOCKER)
    
    

    public void verify_HomePageMenuNavigationMethod (Method method) throws InterruptedException {
        Log.info(method.getName() + " test is starting.");

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("ExtentTestManager_verify OurMergerPage");

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(prop,driver,wait);

        //*************PAGE METHODS********************
        //Open Corteva HomePage
        Log.info("Opening Corteva website.");
        homePage.goToCortevaHomePage();

        //Go to our-merger Page
        Log.info("Opening OurMerger Page.");
        homePage.clickOnWhoWeAre();
        homePage.goOurMergerPage();
        //*************ASSERTIONS***********************
        Thread.sleep(500);
        Log.info("Verifying Whether we are in Our Merger Page.");
        homePage.verifyOurMergerPage("Our Merger");
        
        
        
        
        homePage.clickOnWhoWeAre();      
        homePage.goToOurPurposeAndValuesPage();
        
        homePage.clickOnWhoWeAre();
        homePage.goToLeadershipPage();
        
        homePage.clickOnWhoWeAre();
        homePage.goToHistoryPage();
        
        homePage.clickOnWhoWeAre();
        homePage.goToDiversityPage();
        
        homePage.clickOnWhoWeAre();
        homePage.goToCommunitiesPage();
        
        
        homePage.clickOnOurImpact();
        homePage.goToOurImpactPage();
        
        homePage.clickOnOurImpact();
        homePage.goToInnovationPage();
        
        homePage.clickOnOurImpact();
        homePage.goToSustainabilityPage();
        
        homePage.goToProductsAndServicesPage();
        
        homePage.goToBlogPage();
        
        homePage.goToMediaCenterPage();



    }
	
	@Story("Story 2 - Extra dummy test")
    @Test (priority = 1, description="Extra dummy test")
    @Description("Test Description: Extra dummy test")
	@Severity(SeverityLevel.CRITICAL)
   
    public void verify_DummyMethod () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("ExtentTestManager_verify OurPurposeandValues page");

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(prop,driver,wait);

        //*************PAGE METHODS********************
        
        //Go to Our purpose and values Page
        homePage.clickOnWhoWeAre();
        homePage.goToOurPurposeAndValuesPage();


        //*************ASSERTIONS***********************
        Thread.sleep(500);
        Log.info("Verifying Whether we are in Our purpose and values Page.");
        homePage.verifyOurPurposeAndValuePage("A Commitment to Growing Progress");
        
    }
}