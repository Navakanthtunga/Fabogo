package com.fabogo.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fabogo_SelectedSalonPagePO {
	
	public fabogo_SelectedSalonPagePO(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[@class='link-single-venue w100pc ovf-hidden dpib hover-underline result-title'])[1]")
	private WebElement EleClickOnFirstElement;
	public WebElement getEleClickOnFirstElement()
	{	
		return EleClickOnFirstElement;
	} 
	
	@FindBy(xpath="//a[contains(@data-rating-value,'3.0')]")
	private WebElement EleClickOnRateMeValue;
	public WebElement getEleClickOnRateMeValue()
	{	
		return EleClickOnRateMeValue;
	} 
	
	@FindBy(xpath="//div[@class='text-center p10 text-danger']")
	private WebElement ElePopTxt;
	public WebElement getElePopTxt()
	{	
		return ElePopTxt;
	} 
	
	
}
