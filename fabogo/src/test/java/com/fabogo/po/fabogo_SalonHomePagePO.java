package com.fabogo.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fabogo_SalonHomePagePO {
	
	public fabogo_SalonHomePagePO(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h1[contains(text(),'Salons in Pune')]")
	private WebElement Eleheadertext;
	public WebElement getEleheadertext()
	{	
		return Eleheadertext;	
	} 
	
	@FindBy(xpath="(//a[contains(text(),'Popularity')])[1]")
	private WebElement ElePopularityDropDown;
	public WebElement getElePopularityDropDown()
	{	
		return ElePopularityDropDown;	
	} 
	
	@FindBy(xpath="(//ul[@class='fs90 mb0 list-unstyled']//li//a//span[contains(text(),'Rating (high to low)')])[1]")
	private WebElement EleratingOptclick;
	public WebElement getEleratingOptclick()
	{
		return EleratingOptclick;
	}
	
	@FindBy(xpath="//span[contains(text(),'Men')]")
	private WebElement EleGenderCheckBox;
	public WebElement getEleGenderCheckBox()
	{	
		return EleGenderCheckBox;	
	} 
	
	@FindBy(xpath="(//span[@class='border-radius-3 dpib rating-5 bold-font force-white ']//div//b)[1]")
	private WebElement EleRatingValue;
	public WebElement getEleRatingValue()
	{	
		return EleRatingValue;	
	} 

}
