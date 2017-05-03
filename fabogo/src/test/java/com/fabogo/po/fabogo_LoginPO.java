package com.fabogo.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fabogo_LoginPO 
{
	public fabogo_LoginPO(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="search-selector")
	private WebElement EleSearchTab;
	public WebElement getEleSearchTab()
	{	
		return EleSearchTab;	
	}
	
	@FindBy(xpath="//i[@class=' parenticon parenticon-salon-01-01 __flaticon-hairsalon4']")
	private WebElement EleSalonItem;
	public WebElement getEleSalonItem()
	{	
		return EleSalonItem;	
	}
	
	@FindBy(xpath="//button[@id='search-bar-button']")
	private WebElement EleSearchButton;
	public WebElement getEleSearchButton()
	{	
		return EleSearchButton;	
	}
	
	@FindBy(xpath="//a[contains(text(),'BODY')]")
	private WebElement EleBodyTab;
	public WebElement getEleBodyTab()
	{	
		return EleBodyTab;	
	}
	
	@FindBy(xpath="(//ul[@class='list-unstyled'])[2]//child::li/a[contains(text(),'Tattoo')]")
	private WebElement EleClicktattoo;
	public WebElement getEleClicktattoo()
	{	
		return EleClicktattoo;	
	}

}
