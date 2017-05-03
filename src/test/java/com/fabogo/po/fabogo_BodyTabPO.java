package com.fabogo.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class fabogo_BodyTabPO {
	
	public fabogo_BodyTabPO(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[contains(text(),'Login')])[2]")
	private WebElement EleLoginTab;
	public WebElement getEleLoginTab()
	{	
		return EleLoginTab;	
	}
	
	
	@FindBy(xpath="//a[contains(text(),'BODY')]")
	private WebElement EleBodyTab;
	public WebElement getEleBodyTab()
	{	
		return EleBodyTab;	
	}
	
	@FindBy(xpath="//ul[@class='list-unstyled']//a[contains(text(),'Tattoo')]")
	private WebElement EleTattooItem;
	public WebElement getEleTattooItem()
	{	
		return EleTattooItem;	
	}
	
	@FindBy(xpath="//h1[contains(text(),'Salons in Pune')]")
	private WebElement Eletattooheadertext;
	public WebElement gettattooEleheadertext()
	{	
		return Eletattooheadertext;	
	} 
	
	@FindBy(xpath="(//b[contains(text(),'votes')])[1]")
	private WebElement EleVotesValue;
	public WebElement getEleVotesValue()
	{	
		return EleVotesValue;	
	} 

	@FindBy(xpath="//ul[@class='pagination']")
	private WebElement ElePagnation;
	public WebElement getElePagnation()
	{	
		return ElePagnation;	
	} 
	
	@FindBy(xpath="//a[@rel='next']")
	private WebElement EleNextbutton;
	public WebElement getEleNextbutton()
	{	
		return EleNextbutton;	
	}
	
	@FindBy(xpath="//div[@class='col-md-9 pl0-mobile mt0 pl10 pr10 pr0-mobile li-pl0']")
	private WebElement EleAllItemsValueDisplay;
	public WebElement getEleAllItemsValueDisplay()
	{	
		return EleAllItemsValueDisplay;	
	}
	
}