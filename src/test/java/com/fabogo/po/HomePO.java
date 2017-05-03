package com.fabogo.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePO {
	WebDriver driver=null;
	
	public HomePO(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="search-selector")
	private WebElement eleSearchFld;
	public WebElement getEleSearchFld(){
		return eleSearchFld;
	}
	@FindBy(id="location-selector")
	private WebElement eleLocationFld;
	public WebElement getEleLocationFld(){
		return eleLocationFld;
	}
	@FindBy(id="search-bar-button")
	private WebElement eleSearchBtn;
	public WebElement getEleSearchBtn(){
		return eleSearchBtn;
	}
	@FindBy(xpath="//i[@class=' flaticon glyph-icon flaticon-women']")
	private WebElement nailServiceOpt;
	public WebElement getEleNailServiceOpt(){
		return nailServiceOpt;
	}
	@FindBy(xpath="//ul[@id='ui-id-2']//li[contains(@id,'ui-id-')]//a//div")
	private WebElement eleLocationSuggestionsTxt;
	public WebElement getEleLocationSuggestionsTxt(){
		return eleLocationSuggestionsTxt;
	}
	@FindBy(xpath="//b[text()='POPULAR LOCATIONS']")
	private WebElement elePopularLocationsTxt;
	public WebElement getElePopularLocationsTxt(){
		return elePopularLocationsTxt;
	}

	
	@FindBy(id="ajax-login-link")
	private WebElement eleLoginLnk;
	
	public WebElement geteleLoginLink(){
		
		return eleLoginLnk;
	}
	
	@FindBy(name="name")
	private WebElement eleNameTxtBx;
	
	public WebElement geteleNameTxtBx(){
		return eleNameTxtBx;
	}
	
	@FindBy(name="email")
	private WebElement eleEmailTxtBx;
	
	public WebElement geteleEmailTxtBx(){
		return eleEmailTxtBx;
	}
	
	@FindBy(name="password")
	private WebElement elePasswordTxtBx;
	
	public WebElement getelePasswordTxtBx(){
		return elePasswordTxtBx;
	}
	
	@FindBy(name="password_confirmation")
	private WebElement elePassword_confirmationTxtBx;
	
	public WebElement getelePassword_confirmationTxtBx(){
		return elePassword_confirmationTxtBx;
	}
	
	@FindBy(id="btn-login")
	private WebElement eleSignUpBtn;
	
	public WebElement geteleSignUpBtn(){
		
		return eleSignUpBtn;
	}
	
	@FindBy(xpath="//img[@src='https://s3.amazonaws.com/mazkaracdn/assets/fabogo-logo.svg']")
	private WebElement eleFabogoClickableLogo;
	
	public WebElement geteleFabogoClickableLogo(){
		return eleFabogoClickableLogo;
	}
	
	@FindBy(id="lnk-sign-in")
	private WebElement eleLoginHereLnk;
	
	public WebElement geteleLoginHereLnk(){
		
		return eleLoginHereLnk;
	}
	
	@FindBy(id="txt-email")
	private WebElement eleEmailLoginTxtBx;
	
	public WebElement geteleEmailLoginTxtBx(){
		return eleEmailLoginTxtBx;
		
	}
	
	@FindBy(id="txt-password")
	private WebElement elePwLoginTxtBx;
	
	public WebElement getelePwLoginTxtBx(){
		return elePwLoginTxtBx;
		
	}
	
	@FindBy(id="btn-login")
	private WebElement eleLoginBtn;
	
	public WebElement geteleLoginBtn(){
		
		return eleLoginBtn;
	}
	
	@FindBy(xpath="//span[@class='img-circle dumatar '][@width='25']")
	private WebElement imgCircle;
	
	public WebElement geteleImgCircle(){
		return imgCircle;
	}
	@FindBy(xpath=("//a[text()='ADD YOUR BUSINESS']"))
	private WebElement eleAddYourBusiness;
	
	public WebElement geteleAddYourBusiness(){
		return eleAddYourBusiness;
	}
	
	
	@FindBy(xpath="//a[text()='CONTACT US']")
	private WebElement eleContactUS;
	
	public WebElement geteleContactUS(){
		return eleContactUS;
	}
	
	@FindBy(xpath="//input[@id='search-selector']")
	private WebElement eleSearchServiceTxtBx;
	
	
	public WebElement geteleSearchServiceTB(){
		return eleSearchServiceTxtBx;
	}
	
	@FindBy(xpath="//input[@id='location-selector']")
	private WebElement eleSearchLocTxtBx;
	
	public WebElement geteleSearchLocTB(){
		return eleSearchLocTxtBx;
	}
	
	@FindBy(xpath="//input[@id='location-selector']")
	private WebElement searchBtn;
	
	public WebElement geteleSearchBtn(){
		return searchBtn;
	}	
	public void verifyTitle(String etitle){
		WebDriverWait wait= null;
		try {
			wait.until(ExpectedConditions.titleIs(etitle));
		} catch (Exception e) {
		}
	}
}
