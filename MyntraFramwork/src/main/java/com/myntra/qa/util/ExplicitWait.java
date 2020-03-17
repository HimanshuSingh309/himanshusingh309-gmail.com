package com.myntra.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void explicit_Wait(WebDriver driver, WebElement locator, int TimeOut) {
		new WebDriverWait(driver, TimeOut).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}
	
	public static void explicit_WaitForElement(WebDriver driver, By locator, int TimeOut) {
		new WebDriverWait(driver, TimeOut).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		
	}

}
