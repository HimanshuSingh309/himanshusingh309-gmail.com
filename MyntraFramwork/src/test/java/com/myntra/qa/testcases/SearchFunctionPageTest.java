package com.myntra.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myntra.qa.base.TestBase;
import com.myntra.qa.pages.MyntraLoginPage;
import com.myntra.qa.pages.SearchFunctionPage;
import com.myntra.qa.pages.UserHomePage;

public class SearchFunctionPageTest extends TestBase {
	
	MyntraLoginPage myntraLogin;
	UserHomePage userPage;
	SearchFunctionPage SearchFun;
	
public SearchFunctionPageTest() {
		
		super();
	}
	
	@BeforeMethod()
	public void setup() throws Exception {
		initialization();
		
		myntraLogin = new MyntraLoginPage();
		userPage = myntraLogin.clickOnLoginButton(prop.getProperty("username"), prop.getProperty("password"));	
		SearchFun = new SearchFunctionPage();
	}
	
	@Test(priority=1)
	public void validateSearchResultTextAfterSearching() throws Exception {
		SearchFun.validateSearchFunction(prop.getProperty("searchData"));
		
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
