package com.myntra.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.myntra.qa.base.TestBase;
import com.myntra.qa.util.ExplicitWait;

public class AddAddressPage extends TestBase {
	
	
	@FindBy(xpath = "//input[@name='name']")
	WebElement NameLocator;
	
	@FindBy(xpath = "//input[@name='mobile']")
	WebElement MobileLocator;
	
	@FindBy(xpath = "//input[@name='pincode']")
	WebElement PinCodeLocator;
	
	@FindBy(xpath = "//input[@name='address']")
	WebElement AddressLocator;
	
	@FindBy(xpath = "//input[@name='locality']")
	WebElement LocalityLocator;
	
	@FindBy(xpath = "//input[@name='others']")
	WebElement LocalityOptionLocator;
	
	@FindBy(xpath = "//div[contains(text(),'Confirm')]")
	WebElement ConfirmBtnLocator;
	
	@FindBy(xpath = "//label[@id='Office']")
	WebElement OfficeRadioBtnLocator;
	
	@FindBy(xpath = "//span[contains(text(),'Open on Saturday')]")
	WebElement SatChkBoxLocator;
	
	@FindBy(xpath = "//div[contains(@class,'addAddressModal-button')][contains(text(),'Save')]")
	WebElement SaveBtnLocator;
	
	@FindBy(xpath = "//div[@class='noAddress-button']")
	WebElement AddNewAddLocator;
	
public AddAddressPage() {
		
		PageFactory.initElements(driver, this);
	}

public void addressUpdate(String Name, String Mobile, String Pincode, String Address, String Locality, String TypeOfAddress) throws Exception {
	AddNewAddLocator.click();
	NameLocator.sendKeys(Name);
	MobileLocator.sendKeys(Mobile);
	PinCodeLocator.sendKeys(Pincode);
	AddressLocator.sendKeys(Address);
	Thread.sleep(2000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(true);",SatChkBoxLocator);
	
	Thread.sleep(2000);
	LocalityLocator.click();
	LocalityOptionLocator.sendKeys(Locality);
	ConfirmBtnLocator.click();
	OfficeRadioBtnLocator.click();
	SatChkBoxLocator.click();
	SaveBtnLocator.click();
	
}

}
