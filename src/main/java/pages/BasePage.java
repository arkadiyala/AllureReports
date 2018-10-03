package pages;

import io.qameta.allure.Attachment;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import tests.BaseTest;
import utilities.Log;

public class BasePage extends BaseTest {
	public WebDriver driver;
	public WebDriverWait wait;

	// Constructor
	public BasePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	// Click Method
	public void click(By elementLocation) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(elementLocation));
			driver.findElement(elementLocation).click();
		} catch (NoSuchElementException e) {
			//Log.error("Register element is not found.");
		}
	}

	// Write Text
	public void writeText(By elementLocation, String text) {
		driver.findElement(elementLocation).sendKeys(text);
	}

	// Read Text
	public String readText(By elementLocation) {
		return driver.findElement(elementLocation).getText();
	}

	// Aravind

	// clear
	public void clear(By elementLocation) {
		driver.findElement(elementLocation).clear();
	}

	// getTagName
	public String getTagName(By elementLocation) {
		return driver.findElement(elementLocation).getTagName();
	}

	// isDisplayed
	public Boolean isDisplayed(By elementLocation) {
		return driver.findElement(elementLocation).isDisplayed();
	}

	// isEnabled
	public Boolean isEnabled(By elementLocation) {
		return driver.findElement(elementLocation).isEnabled();
	}

	// isSelected
	public Boolean isSelected(By elementLocation) {
		return driver.findElement(elementLocation).isSelected();
	}

	// getAttribute
	public String getAttribute(By elementLocation, String value) {
		return driver.findElement(elementLocation).getAttribute(value);
	}

	// Write code to below as well
	// getLocation()
}

/*
 * Use below link for more info.
 * http://onlinetraining.etestinghub.com/webdriver-methods-web-elements/ &
 * driver.findElement(By.id("element id"))
 * driver.findElement(By.className("element class"))
 * driver.findElement(By.name("element name"))
 * driver.findElement(By.tagName("element html tag name"))
 * driver.findElement(By.cssSelector("css selector"))
 * driver.findElement(By.link("link text"))
 * driver.findElement(By.xpath("xpath expression"))
 */