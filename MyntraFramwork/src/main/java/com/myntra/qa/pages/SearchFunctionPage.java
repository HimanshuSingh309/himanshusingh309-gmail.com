package com.myntra.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.qa.base.TestBase;

public class SearchFunctionPage extends TestBase {
	
	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	WebElement SearchBar;
	
	@FindBy(xpath = "//a[@class='desktop-submit']")
	WebElement SearchSubmitBtn;
	
	@FindBy(xpath = "//h1[@class='title-title']")
	WebElement SearchResultText;
	
	@FindBy(xpath = "//span[@class='title-count']")
	WebElement SearchResultCount;
	
	public SearchFunctionPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void validateSearchFunction(String data) throws Exception {
		
		SearchBar.sendKeys(data);
		SearchSubmitBtn.click();
		String Results = SearchResultText.getText();
		String count =  SearchResultCount.getText();
		System.out.println(Results + count);
		
	}
	
}
