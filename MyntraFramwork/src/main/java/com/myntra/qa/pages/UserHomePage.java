package com.myntra.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.qa.base.TestBase;
import com.myntra.qa.util.ExplicitWait;

public class UserHomePage extends TestBase {
	@FindBy(xpath = "//span[contains(text(),'Profile')]")
	WebElement ProfileName;
	
	@FindBy(xpath = "//div[@class='desktop-infoEmail']")
	WebElement UserId;
	
	@FindBy(xpath = "//a[contains(text(),'Discover')]")
	WebElement DiscoverTab;
	
	@FindBy(xpath = "//a[@class='desktop-categoryLink'][contains(text(),'Roadster')]")
	WebElement Roadster;
	
	@FindBy(xpath = "//a[contains(text(),'Men')][@class='desktop-main']")
	WebElement MenTab;
	
	@FindBy(xpath = "//a[contains(text(),'Topwear')]")
	WebElement TopWear;
	
	@FindBy(xpath = "//a[contains(text(),'Women')]")
	WebElement WomenTab;
	
	@FindBy(xpath = "//a[contains(text(),'Western Wear')]")
	WebElement WesternWear;
	
	@FindBy(xpath = "//a[@class='desktop-main'][contains(text(),'Kids')]")
	WebElement KidsTab;
	
	@FindBy(xpath = "//a[contains(text(),'Boys Clothing')]")
	WebElement BoysClothing;
	
	@FindBy(xpath = "//div[contains(text(),'Edit Profile')]")
	WebElement EditProfile;
	
	@FindBy(xpath = "//a[text()='Addresses']")
	WebElement Addresses;
	
	
public UserHomePage() {
		
		PageFactory.initElements(driver, this);
	}
	public String getTitleOfUserHomePage() {
		
		return driver.getTitle();
		
	}
	
	public MyProfile clickOnUserId() throws Exception {
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(ProfileName).build().perform();
		String UName = UserId.getText();
		System.out.println(UName);
		ExplicitWait.explicit_Wait(driver, UserId, 10);
		
		return new MyProfile();
		
	}
	
	public MenTopWearPage mousehoverMenTab() throws Exception {
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(MenTab).build().perform();
		Thread.sleep(2000);
		String MenTop = TopWear.getText();
		System.out.println(MenTop);
		ExplicitWait.explicit_Wait(driver, TopWear, 10);
		
		String Mtitle = driver.getTitle();
		System.out.println(Mtitle);
		return new MenTopWearPage();
	}
	
	public WesternWearPage mousehoverWoMenTab() throws Exception {
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(WomenTab).build().perform();
		Thread.sleep(2000);
		String westernwear = WesternWear.getText();
		System.out.println(westernwear);
		ExplicitWait.explicit_Wait(driver, WesternWear, 10);
		return new WesternWearPage();
	}
	
	public BoysClothingPage mousehoverKidsTab() throws Exception {
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(KidsTab).build().perform();
		Thread.sleep(2000);
		String boyscloth = BoysClothing.getText();
		System.out.println(boyscloth);
		ExplicitWait.explicit_Wait(driver, BoysClothing, 10);
		return new BoysClothingPage();
	}
	
	public RoadsterPage mousehoverDiscoverTab() throws Exception {
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(DiscoverTab).build().perform();
		Thread.sleep(2000);
		String roadster = Roadster.getText();
		System.out.println(roadster);
		ExplicitWait.explicit_Wait(driver, Roadster, 10);
		return new RoadsterPage();
	}
	
	public AddAddressPage clickOnEditProfile() throws Exception {
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(ProfileName).build().perform();
		
		ExplicitWait.explicit_Wait(driver, EditProfile, 5);
		Addresses.click();
		
		return new AddAddressPage();
		
		
		
		
	}
	
}
