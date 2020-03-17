package com.myntra.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myntra.qa.base.TestBase;
import com.myntra.qa.pages.MyProfile;
import com.myntra.qa.pages.MyntraLoginPage;
import com.myntra.qa.pages.UserHomePage;

public class MyProfilePageTest extends TestBase {

	MyntraLoginPage myntraLogin;
	UserHomePage userPage;
	MyProfile myProfilePage;
	
public MyProfilePageTest() {
		
		super();
	}
	
	@BeforeMethod()
	public void setup() throws Exception {
		initialization();
		
		myntraLogin = new MyntraLoginPage();
		userPage = myntraLogin.clickOnLoginButton(prop.getProperty("username"), prop.getProperty("password"));	
		myProfilePage =	userPage.clickOnUserId();
	}
	@Test
	public void validateUserDetails() {
		myProfilePage.getProfileDetails();
	}
	
	@AfterMethod()
	public void closeBrowser()
	{
	    try 
	    {
	        driver.close();
	        Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");

	    }
	    catch (Exception anException) 
	    {
	        anException.printStackTrace();
	    }
	}
	
}
