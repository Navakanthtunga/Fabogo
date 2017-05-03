package com.fabogo.testscripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.fabogo.library.BaseLib;
import com.fabogo.library.GenericLib;
import com.fabogo.library.ReportsLibrary;
import com.fabogo.po.AddYourBusinessPO;
import com.fabogo.po.ContactUsPO;
import com.fabogo.po.HomePO;
import com.fabogo.po.SearchSalonPO;

public class RegistrationTest extends BaseLib  {
	HomePO homePo=null;
	AddYourBusinessPO addYourBusinessPo=null;
	ContactUsPO contactusPo = null;
	SearchSalonPO searchSalonPo=null;
	
	@Test(priority=1,enabled=true)
	public void registration() throws Throwable{
		homePo=new HomePO(driver);
		try{
		ReportsLibrary.addStep("Loading the URL");
		launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
		homePo.geteleLoginHereLnk().click();
		homePo.geteleNameTxtBx().sendKeys("Raj Kumar");
		homePo.geteleEmailTxtBx().sendKeys("raj123@gmail.com");
		homePo.getelePasswordTxtBx().sendKeys("Kiran123");
		homePo.getelePassword_confirmationTxtBx().sendKeys("Kiran123");
		homePo.geteleSignUpBtn().click();
		ReportsLibrary.elementDisplay(homePo.geteleFabogoClickableLogo(), "Fabogo Logo");
		ReportsLibrary.elementDisplay(homePo.geteleImgCircle(), "Profile Icon");
		}
		catch(Exception e)
		{
			ReportsLibrary.failStep("Test Failed");
			throw e;
		}
		
	}
	
	@Test(priority=2,enabled=true)
	public void Login() throws Throwable{
		homePo=new HomePO(driver);
		try{
		ReportsLibrary.addStep("Loading the URL");
		launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
		homePo.geteleLoginLink().click();
		homePo.geteleLoginHereLnk().click();
		homePo.geteleEmailLoginTxtBx().sendKeys("raj123@gmail.com");
		homePo.getelePwLoginTxtBx().sendKeys("Kiran123");
		homePo.geteleLoginBtn().click();
		ReportsLibrary.elementDisplay(homePo.geteleFabogoClickableLogo(), "Fabogo Logo");
		ReportsLibrary.elementDisplay(homePo.geteleImgCircle(), "Profile Icon");
		}
		catch(Exception e)
		{
			ReportsLibrary.failStep("Test Failed");
			throw e;
		}
	}
	
	@Test(priority=3,enabled=true)
	public void addYourBusiness() throws Throwable{
	
		homePo=new HomePO(driver);
		addYourBusinessPo=new AddYourBusinessPO(driver);
		try{
		ReportsLibrary.addStep("Loading the URL");
		launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		homePo.geteleAddYourBusiness().click();
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+addYourBusinessPo.name().getLocation().getY()+")");
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"Kumarraman123"+"'",addYourBusinessPo.name());
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"8088205230"+"'",addYourBusinessPo.phone());
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"kumarraman123@gmail.com"+"'",addYourBusinessPo.email());
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"I want to register"+"'",addYourBusinessPo.msg());
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+addYourBusinessPo.sendBtn().getLocation().getY()+")");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",addYourBusinessPo.sendBtn());
		}
		catch(Exception e)
		{
			ReportsLibrary.failStep("Test Failed");
			throw e;
		}
	}
	
	@Test(priority=4,enabled=true)
	public void contactUS() throws Throwable{
		homePo=new HomePO(driver);
		contactusPo=new ContactUsPO(driver);
		try{
			ReportsLibrary.addStep("Loading the URL");
			launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		homePo.geteleContactUS().click();
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+contactusPo.name().getLocation().getY()+")");
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"Kumarraman123"+"'",contactusPo.name());
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"8088205230"+"'",contactusPo.phone());
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"kumarraman123@gmail.com"+"'",contactusPo.email());
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"I want to register"+"'",contactusPo.msg());
		//((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+ad.sendBtn().getLocation().getY()+")");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",contactusPo.sendBtn());
	}
	catch(Exception e)
	{
		ReportsLibrary.failStep("Test Failed");
		throw e;
	}
}
	@Test(priority=5,enabled=true)
	public void sortByName() throws Throwable{
		homePo=new HomePO(driver);
		searchSalonPo=new SearchSalonPO(driver);
		try{
			ReportsLibrary.addStep("Loading the URL");
			launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"Salon"+"'",homePo.geteleSearchServiceTB());
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"Pune"+"'",homePo.geteleSearchLocTB());
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",homePo.getEleSearchBtn());
	
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",searchSalonPo.sortDropDown());
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",searchSalonPo.sortByName());
		}
		catch(Exception e)
		{
			ReportsLibrary.failStep("Test Failed");
			throw e;
		}
	}
	
	@Test(priority=6,enabled=true)
	public void sortByPopularity() throws Throwable {
		
		homePo=new HomePO(driver);
		searchSalonPo=new SearchSalonPO(driver);
		try{
			ReportsLibrary.addStep("Loading the URL");
			launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"Salon"+"'",homePo.geteleSearchServiceTB());
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"Pune"+"'",homePo.geteleSearchLocTB());
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",homePo.getEleSearchBtn());
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",searchSalonPo.sortDropDown());
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",searchSalonPo.sortByPopularity());
		}
		catch(Exception e)
		{
			ReportsLibrary.failStep("Test Failed");
			throw e;
		}
	}
	@Test(priority=7,enabled=true)
	public void sortByRating() throws Throwable{
		homePo=new HomePO(driver);
		searchSalonPo=new SearchSalonPO(driver);
		try{
			ReportsLibrary.addStep("Loading the URL");
			launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"Salon"+"'",homePo.geteleSearchServiceTB());
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+"Pune"+"'",homePo.geteleSearchLocTB());
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",homePo.getEleSearchBtn());
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",searchSalonPo.sortDropDown());
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",searchSalonPo.sortByRating());
	}
	catch(Exception e)
	{
		ReportsLibrary.failStep("Test Failed");
		throw e;
	}
	}

}
