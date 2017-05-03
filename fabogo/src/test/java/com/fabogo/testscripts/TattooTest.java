package com.fabogo.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.fabogo.library.BaseLib;
import com.fabogo.library.GenericLib;
import com.fabogo.library.ReportsLibrary;
import com.fabogo.po.fabogo_BodyTabPO;
import com.fabogo.po.fabogo_LoginPO;
import com.fabogo.po.fabogo_SalonHomePagePO;
import com.fabogo.po.fabogo_SelectedSalonPagePO;

public class TattooTest extends BaseLib

{
	fabogo_BodyTabPO BobyTab=null;
	fabogo_SalonHomePagePO salon= null;
	fabogo_SelectedSalonPagePO selectedSalon= null;
	fabogo_LoginPO fabogo=null;
	
 @Test(priority=1,enabled=false)
 
 public void VerifytattoContentdisplay() throws Throwable  
 {
	 BobyTab= new fabogo_BodyTabPO(driver);
	 salon= new fabogo_SalonHomePagePO(driver);
	 selectedSalon= new fabogo_SelectedSalonPagePO(driver);
		 try {
			 launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
			 String strPageTitle=driver.getTitle();
			 Assert.assertTrue(strPageTitle.equalsIgnoreCase("fabogo"), "Page title doesn't match");
			 Thread.sleep(6000);
			 BobyTab.getEleLoginTab().click();
			 Thread.sleep(2000);
			 driver.navigate().back();
			 Thread.sleep(5000);
			 System.out.println("------------------------------");
			 List<WebElement> MainMenuTabValues = driver.findElements(By.xpath("//li[@class='dropdown yamm-fw parent']"));
			 System.out.println(MainMenuTabValues.size());
			 System.out.println("------------------------------");
			 Thread.sleep(3000);
			 BobyTab.getEleBodyTab().click();
			 System.out.println("Clicked>>>>>>"+BobyTab.getEleBodyTab().isDisplayed());
			 Thread.sleep(2000);
			 mouseHoverByJavascriptExecutor(BobyTab.getEleTattooItem());
			 clickByJavascriptExecutor(BobyTab.getEleTattooItem());
			//validation in tattoo page
			 String tattooPageTxt=BobyTab.gettattooEleheadertext().getText();
			 System.out.println("Page is displayed :" +tattooPageTxt );
			 Thread.sleep(5000);
			 String TxtTattoo=salon.getEleRatingValue().getText();
			 System.out.println("First Link Rating is: " +TxtTattoo);
			 boolean ValuePresent=BobyTab.getEleVotesValue().isDisplayed();
			 System.out.println("Number of votes are:"+ValuePresent);
			 String Value=BobyTab.getEleVotesValue().getText();
			 System.out.println("Number of votes are:"+Value);
			 selectedSalon.getEleClickOnFirstElement().click();
			 Thread.sleep(3000);
		 	} 
			catch(Exception e)
			{
				ReportsLibrary.failStep("Test Failed");
				throw e;
			}
}
 
 	@Test(priority=2,enabled=true)
 
 	public void VerifytattoAllItemsdisplay() throws Throwable  
 	{
	 BobyTab= new fabogo_BodyTabPO(driver);
	 salon= new fabogo_SalonHomePagePO(driver);
	 selectedSalon= new fabogo_SelectedSalonPagePO(driver);
	 
		 try {
			 launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));	 Thread.sleep(8000);
		 
			 scrollToView(BobyTab.getElePagnation());
		 
			 BobyTab.getEleNextbutton().click();
			 System.out.println(BobyTab.getEleAllItemsValueDisplay().getSize());
		 
			 List<WebElement> AllElements = driver.findElements(By.xpath("//div[@class='relative border-radius-3 ba bg-white clearfix']//h3//a"));
			 for(WebElement DisplayItems:AllElements ){
				 System.out.println("All items must be listed here:"+DisplayItems.getText());
			 }
		 } 
		catch(Exception e)
		{
			ReportsLibrary.failStep("Test Failed");
			throw e;
		}
 }
	@Test(priority=3,enabled=true)
 
	 public void VerifyContentdisplay() throws Throwable  
	 {
		 fabogo= new fabogo_LoginPO(driver);
		 salon= new fabogo_SalonHomePagePO(driver);
		 selectedSalon= new fabogo_SelectedSalonPagePO(driver);
		 try {
			 launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));	 Reporter.log("Application Lauched successfully | ");
			 Thread.sleep(10000);
			 System.out.println("Clicked>>>>>>"+fabogo.getEleSearchTab().isDisplayed());
			 fabogo.getEleSearchTab().click();
			 Thread.sleep(2000);
			 fabogo.getEleSalonItem().click();
			 Thread.sleep(2000);
			 fabogo.getEleSearchButton().click();;
			 Thread.sleep(5000);
			 //Second Page Validation
			 String Txt= salon.getEleheadertext().getText();
			 System.out.println("Validation of header" +Txt);
			 Thread.sleep(3000);
			 salon.getElePopularityDropDown().click();
			 Thread.sleep(2000);
			 salon.getEleratingOptclick().click();
			 String rateTxt=salon.getEleratingOptclick().getText();
			 System.out.println("Sorting the value from popularity to rating:" +rateTxt);
			 Thread.sleep(2000);
			 String Gender_txt=salon.getEleGenderCheckBox().getText();
			 System.out.println("Clicked on Gender:" +Gender_txt);
			 Thread.sleep(3000);
			 salon.getEleGenderCheckBox().click();
			 String rate_txt=salon.getEleRatingValue().getText();
			 System.out.println("Rating of first link in the page:" +rate_txt);
			 Thread.sleep(5000);
			 //selected salon item page validation
			 selectedSalon.getEleClickOnFirstElement().click();
			 Thread.sleep(5000);
			 selectedSalon.getEleClickOnRateMeValue().click();
			 Thread.sleep(2000);
			 boolean elementTxtPresence = selectedSalon.getElePopTxt().isDisplayed();
			 System.out.println("Warning message displayed in PopUp is:" + elementTxtPresence);
		 } 
			catch(Exception e)
			{
				ReportsLibrary.failStep("Test Failed");
				throw e;
			}
	 }
}
