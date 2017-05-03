package com.fabogo.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class SearchSalonPO {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public SearchSalonPO(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver, 5);
		PageFactory.initElements(driver, this);
		
	}
	public void verifyTitle(String etitle){
		try {
			wait.until(ExpectedConditions.titleIs(etitle));
			Reporter.log("Title is Same", true);
		} catch (Exception e) {
			Reporter.log("Title is not Same", true);
			Assert.fail();
		}
	}
	public void verifyElemetIsPresent(WebElement element){
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is Present",true);
		} 
		catch (Exception e) {
			Reporter.log("Element is not Present",true);
			Assert.fail();
		}		
		
	}
	
	@FindBy(xpath="//span[@class='pull-right fs75 mt2 fa fa-chevron-down']")
	private WebElement sortDropDown;
	
	public WebElement sortDropDown(){
		return sortDropDown;		
	}
	
	@FindBy(xpath="//span[contains(text(),'(high to low)')][@class='pull-left fw900 '][contains(text(),'Popularity')]")
	private WebElement sortByPopularity;
	
	public WebElement sortByPopularity(){
		return sortByPopularity;
	}
	
	@FindBy(xpath="//span[contains(text(),'(high to low)')][@class='pull-left fw900 '][contains(text(),'Rating')]")
	private WebElement sortByRating;
	
	public WebElement sortByRating(){
		return sortByRating;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'(high to low)')][@class='pull-left fw900 '][contains(text(),'Name')]")
	private WebElement sortByName;
	
	public WebElement sortByName(){
		return sortByName;
	}
	
	

}
