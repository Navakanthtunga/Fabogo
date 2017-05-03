package com.fabogo.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class ContactUsPO {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public ContactUsPO(WebDriver driver) {
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
	
	@FindBy(id="name")
	private WebElement name;
	
	public WebElement name(){
		return name;
	}
	
	@FindBy(id="phone")
	private WebElement phone;
	
	public WebElement phone()
	{
		return phone;		
	}
	
	@FindBy(id="email")
	private WebElement email;
	
	public WebElement email(){
		return email;
	}
	
	@FindBy(id="message")
	private WebElement msg;
	
	public WebElement msg(){
		return msg;
	}
	
	@FindBy(id="submit-btn")
	private WebElement sendBtn;
	
	public WebElement sendBtn(){
		return sendBtn;
	}
	

}
