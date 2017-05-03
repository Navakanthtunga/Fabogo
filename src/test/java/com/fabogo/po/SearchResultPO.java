package com.fabogo.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPO {
	WebDriver driver=null;
	public SearchResultPO(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//small[text()='SPONSORED']/..//b)[1]")
	private WebElement eleSponsoredVenue;
	public WebElement getEleSponseredVenue(){
		return eleSponsoredVenue;
	}
	@FindBy(xpath="//div[@class='col-md-3 col-xs-3']")
	private WebElement eleVenueCnt;
	public WebElement getEleVenueCnt(){
		return eleVenueCnt;
	}
	@FindBy(xpath="(//div[@class=' listing']//h3)[1]")
	private WebElement eleVenueLnk;
	public WebElement getEleVenueLnk(){
		return eleVenueLnk;
	}
	@FindBy(id="lnk-to-change-location")
	private WebElement eleChangeLocationLnk;
	public WebElement getEleChangeLocationLnk(){
		return eleChangeLocationLnk;
	}

}
