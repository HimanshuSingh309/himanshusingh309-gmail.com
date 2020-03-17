/*.... 
   Author Himansu Singh....*/

package com.myntra.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.qa.base.TestBase;

public class MyProfile extends TestBase{
	
	@FindBy(xpath = "//td[text()='Email-Id']")
	WebElement EmailId;
	
	@FindBy(xpath = "//tr[1]//td[2]")
	WebElement EmailLocator;
	
	@FindBy(xpath = "//td[text()='First Name']")
	WebElement FirstName;
	
	@FindBy(xpath = "//tr[2]//td[2]")
	WebElement FirstNameLocator;
	
	@FindBy(xpath = "//td[text()='Last Name']")
	WebElement LastName;
	
	@FindBy(xpath = "//tr[3]//td[2]")
	WebElement LastNameLocator;
	
	@FindBy(xpath = "//td[text()='Gender']")
	WebElement Gender;
	
	@FindBy(xpath = "//tr[4]//td[2]")
	WebElement GenderLocator;
	
	@FindBy(xpath = "//td[text()='Date of Birth']")
	WebElement BirthDate;
	
	@FindBy(xpath = "//tr[5]//td[2]")
	WebElement BirthDateLocator;
	
	@FindBy(xpath = "//td[text()='Mobile']")
	WebElement Mobile;
	
	@FindBy(xpath = "//tr[6]//td[2]")
	WebElement MobileLocator;
	
	@FindBy(xpath = "//td[text()='Location']")
	WebElement Location;
	
	@FindBy(xpath = "//tr[7]//td[2]")
	WebElement LocationLocator;
	
	public MyProfile() {
		
		PageFactory.initElements(driver, this);
	}

	public void getProfileDetails() {
		
		System.out.println(EmailId.getText()+" : "+EmailLocator.getText());
		System.out.println(FirstName.getText()+" : "+FirstNameLocator.getText());
		System.out.println(LastName.getText()+" : "+LastNameLocator.getText());
		System.out.println(Gender.getText()+" : "+GenderLocator.getText());
		System.out.println(BirthDate.getText()+" : "+BirthDateLocator.getText());
		System.out.println(Mobile.getText()+" : "+MobileLocator.getText());
		System.out.println(Location.getText()+" : "+LocationLocator.getText());
		
	}

}
