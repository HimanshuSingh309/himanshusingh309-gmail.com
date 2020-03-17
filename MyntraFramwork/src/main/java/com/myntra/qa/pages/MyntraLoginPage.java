package com.myntra.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.qa.util.ExplicitWait;
import com.myntra.qa.base.TestBase;


public class MyntraLoginPage extends TestBase{
	
	@FindBy(xpath = "//div[@class='desktop-userIconsContainer']")
	WebElement SignInProfile;
	
	@FindBy(xpath = "//a[contains(text(),'log in')]")
	WebElement LogInBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Sign up')]")
	WebElement SignUpBtn;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement UserName;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;
	
	@FindBy(xpath = "//button[@class='login-login-button']")
	WebElement LoginBtn;
	
public MyntraLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
public String validateMyntraHomePageTitle() {
	return driver.getTitle();
}

public String getCurrentUrlMyntraHomePage() {
	return driver.getCurrentUrl();
}

public UserHomePage clickOnLoginButton(String un, String pwd) {
	Actions action = new Actions(driver);
	action.moveToElement(SignInProfile).build().perform();
	
	ExplicitWait.explicit_Wait(driver, LogInBtn, 10);
	UserName.sendKeys(un);
	Password.sendKeys(pwd);
	LoginBtn.click();
	
	return new UserHomePage();
	
}
	

}
