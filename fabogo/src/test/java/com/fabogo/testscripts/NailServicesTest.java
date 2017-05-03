package com.fabogo.testscripts;



import org.testng.annotations.Test;

import com.fabogo.library.BaseLib;
import com.fabogo.library.GenericLib;
import com.fabogo.library.ReportsLibrary;
import com.fabogo.po.HomePO;
import com.fabogo.po.SearchResultPO;
import com.fabogo.po.VenueListPO;

public class NailServicesTest extends BaseLib{
	HomePO homePo=null;
	VenueListPO venueListPo=null;
	SearchResultPO searchResultPO=null;
	@Test(priority=1,enabled=false,description="Search for Nail Services, Select a venue , verify 'Phone number' button,'View All Services', 'Report a problem' link in Venue details page.")
	public void verifyPhonenumberAndViewAllServicesLink() throws Throwable
	{	
		homePo=new HomePO(driver);
		venueListPo=new VenueListPO(driver);
		try {
			ReportsLibrary.addStep("Loading the URL");
			launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
			ReportsLibrary.elementDisplay(homePo.getEleSearchFld(), "Fabogo Home Page");
			homePo.getEleSearchFld().click();
			ReportsLibrary.elementDisplay(homePo.getEleNailServiceOpt(), "Nail Service in list of Services");
			homePo.getEleNailServiceOpt().click();
			Thread.sleep(2000);
			homePo.getEleSearchBtn().click();
			Thread.sleep(5000);
			visibilityOfElementWait(venueListPo.getEleTheLittleHairSalonLnk(), 5000, "The Little Hair Salon Link ");
			ReportsLibrary.elementDisplay(venueListPo.getEleTheLittleHairSalonLnk(), "The Little Hair Salon Link in List of Venue page ");
			venueListPo.getEleTheLittleHairSalonLnk().click();
			ReportsLibrary.addStep("Clicked on the Venue");
			ReportsLibrary.elementDisplay(venueListPo.getElePhoneNumberBtn(), "Phone Number Button");
			Thread.sleep(5000);
			venueListPo.getElePhoneNumberBtn().click();
			ReportsLibrary.elementDisplay(venueListPo.getElePhoneNumberInstructionTxt(), "'Prior bookings are recommended' text");
			scrollToView(venueListPo.getEleViewAllServicesLnk());
			ReportsLibrary.elementDisplay(venueListPo.getEleViewAllServicesLnk(), "'View All Services' Link");
			venueListPo.getEleViewAllServicesLnk().click();
			ReportsLibrary.elementDisplay(venueListPo.getEleHideAllServicesLnk(), "'Hide All Services' Link");
			scrollToView(venueListPo.getEleReportProblemLnk());
			Thread.sleep(2000);
			venueListPo.getEleReportProblemLnk().click();
			ReportsLibrary.elementDisplay(venueListPo.getEleReportPopup(), "'Report Problem' popup");
			ReportsLibrary.elementDisplay(venueListPo.getEleFirstNameTxtFld(), "'First Name' Text Field in Report Problem popup");
			Thread.sleep(2000);
			venueListPo.getEleReportCloseIcn().click();
		} 
		catch(Exception e)
		{
			ReportsLibrary.failStep("Test Failed");
			throw e;
		}
	}
	@Test(priority=2,enabled=false,description="Search for Nail Services, Select a venue,  Verify whether login page is displayed when user click on 'Heart' icon, 'Rating' icons in Venue details page without loggingg in to the application.")
	public void verifyFavoriteAndRatingFunctionality()throws Throwable{
		homePo=new HomePO(driver);
		venueListPo=new VenueListPO(driver);
		try {
			ReportsLibrary.addStep("Loading the URL");
			launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
			ReportsLibrary.elementDisplay(homePo.getEleSearchFld(), "Fabogo Home Page");
			homePo.getEleSearchFld().click();
			ReportsLibrary.elementDisplay(homePo.getEleNailServiceOpt(), "Nail Service in list of Services");
			homePo.getEleNailServiceOpt().click();
			Thread.sleep(2000);
			homePo.getEleSearchBtn().click();
			visibilityOfElementWait(venueListPo.getEleTheLittleHairSalonLnk(), 5000, "The Little Hair Salon Link ");
			ReportsLibrary.elementDisplay(venueListPo.getEleTheLittleHairSalonLnk(), "The Little Hair Salon Link in List of Venue page ");
			venueListPo.getEleTheLittleHairSalonLnk().click();
			ReportsLibrary.addStep("Clicked on the Venue");
			visibilityOfElementWait(venueListPo.getEleFavoriteIcn(), 5000, "The Little Hair Salon Link ");
			venueListPo.getEleFavoriteIcn().click();
			ReportsLibrary.addStep("Clicked on Favourite Icon");
			Thread.sleep(5000);
			ReportsLibrary.elementDisplay(venueListPo.getEleLoginBtn(), "Login Button is displayed");
			driver.navigate().back();
			Thread.sleep(2000);
			//venueListPo.getEleCloseIcn().click();
			ReportsLibrary.addStep("Closed the 'Login' popup");
			venueListPo.getEleRatingIcn().click();
			ReportsLibrary.addStep("Clicked on Rating icons");
			Thread.sleep(2000);
			ReportsLibrary.elementDisplay(venueListPo.getEleLoginBtn(), "Login Button is displayed");
			venueListPo.getEleCloseIcn().click();
			//driver.navigate().back();
			ReportsLibrary.addStep("Closed the 'Login' popup");
		} 
		catch(Exception e)
		{
			ReportsLibrary.failStep("Test Failed");
			throw e;
		}
		}
	@Test(priority=3,enabled=false,description="Verify whether user can Share an venue using 'Share' link without logging into Application. ")
	public void verifyShareFunctionality()throws Throwable{
	homePo=new HomePO(driver);
	venueListPo=new VenueListPO(driver);
		try {
			ReportsLibrary.addStep("Loading the URL");
			launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
			ReportsLibrary.elementDisplay(homePo.getEleSearchFld(), "Fabogo Home Page");
			homePo.getEleSearchFld().click();
			ReportsLibrary.elementDisplay(homePo.getEleNailServiceOpt(), "Nail Service in list of Services");
			homePo.getEleNailServiceOpt().click();
			Thread.sleep(2000);
			homePo.getEleSearchBtn().click();
	
			visibilityOfElementWait(venueListPo.getEleTheLittleHairSalonLnk(), 5000, "The Little Hair Salon Link ");
			ReportsLibrary.elementDisplay(venueListPo.getEleTheLittleHairSalonLnk(), "The Little Hair Salon Link in List of Venue page ");
			venueListPo.getEleTheLittleHairSalonLnk().click();
			ReportsLibrary.addStep("Clicked on the Venue");
			
			Thread.sleep(5000);
			visibilityOfElementWait(venueListPo.getEleShareLnk(), 5000, "The Little Hair Salon Link ");
			clickByJavascriptExecutor(venueListPo.getEleShareLnk());
			ReportsLibrary.addStep("Clicked on 'Share' Link");
			ReportsLibrary.elementDisplay(venueListPo.getEleInstrTxt(), "Instrctions");
			Thread.sleep(2000);
			venueListPo.getEleOkBtn().click();
			ReportsLibrary.addStep("Clicked on 'OK' button");
			} 
		catch(Exception e)
		{
			ReportsLibrary.failStep("Test Failed");
			throw e;
		}
	}
	@Test(priority=4,enabled=false,description="Search For a venue, Select the venue and select any venue from 'Featured' Section")
	public void sponseredVenues()throws Throwable{
		homePo=new HomePO(driver);
		venueListPo=new VenueListPO(driver);
		searchResultPO=new SearchResultPO(driver);
		try {
			ReportsLibrary.addStep("Loading the URL");
			launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
			ReportsLibrary.elementDisplay(homePo.getEleSearchFld(), "Fabogo Home Page");
			homePo.getEleSearchFld().click();
			ReportsLibrary.elementDisplay(homePo.getEleNailServiceOpt(), "Nail Service in list of Services");
			homePo.getEleNailServiceOpt().click();
			Thread.sleep(2000);
			homePo.getEleSearchBtn().click();
			Thread.sleep(10000);
			ReportsLibrary.elementDisplay(searchResultPO.getEleSponseredVenue(), "Sponsered Venues");
			clickByJavascriptExecutor(searchResultPO.getEleSponseredVenue());
			ReportsLibrary.addStep("Clicked on the Sponsered Venue");
			
			if(searchResultPO.getEleVenueCnt().isDisplayed()){
			ReportsLibrary.addStep("Redirecting to more than one Venues");
			Thread.sleep(2000);
			searchResultPO.getEleVenueLnk().click();
			ReportsLibrary.addStep("Clicked on the  Venues");
			Thread.sleep(6000);
			ReportsLibrary.elementDisplay(venueListPo.getElePhoneNumberBtn(), "Phone Number Button");
			Thread.sleep(5000);
			venueListPo.getElePhoneNumberBtn().click();
			ReportsLibrary.elementDisplay(venueListPo.getElePhoneNumberInstructionTxt(), "'Prior bookings are recommended' text");
			scrollToView(venueListPo.getEleViewAllServicesLnk());
			ReportsLibrary.elementDisplay(venueListPo.getEleViewAllServicesLnk(), "'View All Services' Link");
			venueListPo.getEleViewAllServicesLnk().click();
			ReportsLibrary.elementDisplay(venueListPo.getEleHideAllServicesLnk(), "'Hide All Services' Link");
			scrollToView(venueListPo.getEleReportProblemLnk());
			Thread.sleep(2000);
			venueListPo.getEleReportProblemLnk().click();
			ReportsLibrary.elementDisplay(venueListPo.getEleReportPopup(), "'Report Problem' popup");
			ReportsLibrary.elementDisplay(venueListPo.getEleFirstNameTxtFld(), "'First Name' Text Field in Report Problem popup");
			Thread.sleep(2000);
			venueListPo.getEleReportCloseIcn().click();
			Thread.sleep(2000);
			venueListPo.getEleFavoriteIcn().click();
			ReportsLibrary.addStep("Clicked on Favourite Icon");
			Thread.sleep(5000);
			ReportsLibrary.elementDisplay(venueListPo.getEleLoginBtn(), "Login Button is displayed");
			driver.navigate().back();
			Thread.sleep(2000);
			//venueListPo.getEleCloseIcn().click();
			ReportsLibrary.addStep("Closed the 'Login' popup");
			venueListPo.getEleRatingIcn().click();
			ReportsLibrary.addStep("Clicked on Rating icons");
			Thread.sleep(2000);
			ReportsLibrary.elementDisplay(venueListPo.getEleLoginBtn(), "Login Button is displayed");
			venueListPo.getEleCloseIcn().click();
			//driver.navigate().back();
			ReportsLibrary.addStep("Closed the 'Login' popup");
			Thread.sleep(5000);
			clickByJavascriptExecutor(venueListPo.getEleShareLnk());
			ReportsLibrary.addStep("Clicked on 'Share' Link");
			ReportsLibrary.elementDisplay(venueListPo.getEleInstrTxt(), "Instrctions");
			Thread.sleep(2000);
			venueListPo.getEleOkBtn().click();
			}
		else {
			ReportsLibrary.elementDisplay(venueListPo.getElePhoneNumberBtn(), "Phone Number Button");
			Thread.sleep(5000);
			venueListPo.getElePhoneNumberBtn().click();
			ReportsLibrary.elementDisplay(venueListPo.getElePhoneNumberInstructionTxt(), "'Prior bookings are recommended' text");
			scrollToView(venueListPo.getEleViewAllServicesLnk());
			ReportsLibrary.elementDisplay(venueListPo.getEleViewAllServicesLnk(), "'View All Services' Link");
			venueListPo.getEleViewAllServicesLnk().click();
			ReportsLibrary.elementDisplay(venueListPo.getEleHideAllServicesLnk(), "'Hide All Services' Link");
			scrollToView(venueListPo.getEleReportProblemLnk());
			Thread.sleep(2000);
			venueListPo.getEleReportProblemLnk().click();
			ReportsLibrary.elementDisplay(venueListPo.getEleReportPopup(), "'Report Problem' popup");
			ReportsLibrary.elementDisplay(venueListPo.getEleFirstNameTxtFld(), "'First Name' Text Field in Report Problem popup");
			Thread.sleep(2000);
			venueListPo.getEleReportCloseIcn().click();
			Thread.sleep(2000);
			venueListPo.getEleFavoriteIcn().click();
			ReportsLibrary.addStep("Clicked on Favourite Icon");
			Thread.sleep(5000);
			ReportsLibrary.elementDisplay(venueListPo.getEleLoginBtn(), "Login Button is displayed");
			driver.navigate().back();
			Thread.sleep(2000);
			//venueListPo.getEleCloseIcn().click();
			ReportsLibrary.addStep("Closed the 'Login' popup");
			venueListPo.getEleRatingIcn().click();
			ReportsLibrary.addStep("Clicked on Rating icons");
			Thread.sleep(2000);
			ReportsLibrary.elementDisplay(venueListPo.getEleLoginBtn(), "Login Button is displayed");
			venueListPo.getEleCloseIcn().click();
			//driver.navigate().back();
			ReportsLibrary.addStep("Closed the 'Login' popup");
			Thread.sleep(5000);
			clickByJavascriptExecutor(venueListPo.getEleShareLnk());
			ReportsLibrary.addStep("Clicked on 'Share' Link");
			ReportsLibrary.elementDisplay(venueListPo.getEleInstrTxt(), "Instrctions");
			Thread.sleep(2000);
			venueListPo.getEleOkBtn().click();
		}
	} 
		catch(Exception e)
		{
			ReportsLibrary.failStep("Test Failed");
			throw e;
		}
	}	
	@Test(priority=5,enabled=false,description="Search For a service, Click on 'Search' button, verify Filter Functionality")
	public void filterFunctionality()throws Throwable
	{
		homePo=new HomePO(driver);
		venueListPo=new VenueListPO(driver);
		searchResultPO=new SearchResultPO(driver);
		try {
			 ReportsLibrary.addStep("Loading the URL");
			 launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
		 	 ReportsLibrary.elementDisplay(homePo.getEleSearchFld(), "Fabogo Home Page");
		 	 homePo.getEleSearchFld().click();
			 ReportsLibrary.elementDisplay(homePo.getEleNailServiceOpt(), "Nail Service in list of Services");
			 homePo.getEleNailServiceOpt().click();
			 Thread.sleep(2000);
			 homePo.getEleSearchBtn().click();
			 Thread.sleep(10000);
			 scrollToView(venueListPo.getEleMoreFiltersTxt());
			 Thread.sleep(2000);
			 clickByJavascriptExecutor(venueListPo.getEleOpenNowChBx());
			 ReportsLibrary.addStep("Clicked on 'Open Now' checkbox under 'More Filters'");
			 Thread.sleep(30000);
			 scrollToView(venueListPo.getEleMoreFiltersTxt());
			 clickByJavascriptExecutor(venueListPo.getEleWiFiChBx());
			 ReportsLibrary.addStep("Clicked on 'WiFi' checkbox under 'More Filters'");
			 Thread.sleep(30000);
			 searchResultPO.getEleVenueLnk().click();
			 ReportsLibrary.addStep("Clicked on the  Venues");
			 } 
		catch(AssertionError e)
			 {
			 	ReportsLibrary.failStep("Test Failed");
			 	throw e;
			 }
	}
	@Test(priority=6,enabled=false,description="Verification of Pagination Functionaliy in the venues list page")
	public void paginationFunctionality()throws Throwable
	{
		homePo=new HomePO(driver);
		venueListPo=new VenueListPO(driver);
		searchResultPO=new SearchResultPO(driver);
		try{
			ReportsLibrary.addStep("Loading the URL");
			launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
			ReportsLibrary.elementDisplay(homePo.getEleSearchFld(), "Fabogo Home Page");
			homePo.getEleSearchFld().click();
			ReportsLibrary.elementDisplay(homePo.getEleNailServiceOpt(), "Nail Service in list of Services");
			homePo.getEleNailServiceOpt().click();
			Thread.sleep(2000);
			homePo.getEleSearchBtn().click();
			Thread.sleep(10000);
			scrollToView(venueListPo.getElePaginationSct());
			System.out.println("Size"+venueListPo.getElePaginationBx().size());
			for(int i=0;i<=venueListPo.getElePaginationBx().size()-2;i++){
				venueListPo.getEleNextIcn().click();
				Thread.sleep(5000);		
				}
			}	 
		catch(AssertionError e)
			{
			ReportsLibrary.failStep("Test Failed");
				throw e;
			}
	}
	@Test(priority=7,enabled=false,description="Select for a service, Search For a venue,  select a venue from 'Featured' Section, Verify 'Phone Number' button, 'View All Services' Link, 'Report Problem' Link, 'Favourite' Icon and 'Share 'link.")
	public void featuredVenue()throws Throwable
	{
		homePo=new HomePO(driver);
		venueListPo=new VenueListPO(driver);
		searchResultPO=new SearchResultPO(driver);
		try{
			ReportsLibrary.addStep("Loading the URL");
			launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
			ReportsLibrary.elementDisplay(homePo.getEleSearchFld(), "Fabogo Home Page");
			homePo.getEleSearchFld().click();
			ReportsLibrary.elementDisplay(homePo.getEleNailServiceOpt(), "Nail Service in list of Services");
			homePo.getEleNailServiceOpt().click();
			Thread.sleep(2000);
			homePo.getEleSearchBtn().click();
			Thread.sleep(10000);
			venueListPo.getEleTheLittleHairSalonLnk().click();
			ReportsLibrary.addStep("Searching for 'Featured venues'.");
			scrollToView(venueListPo.getEleFeaturedVenue());
			venueListPo.getEleFeaturedVenue().click();
			Thread.sleep(2000);
			ReportsLibrary.addStep("Clicked on 'Featured Venue'");
			ReportsLibrary.elementDisplay(venueListPo.getElePhoneNumberBtn(), "Phone Number Button");
			Thread.sleep(5000);
			venueListPo.getElePhoneNumberBtn().click();
			ReportsLibrary.elementDisplay(venueListPo.getElePhoneNumberInstructionTxt(), "'Prior bookings are recommended' text");
			scrollToView(venueListPo.getEleViewAllServicesLnk());
			ReportsLibrary.elementDisplay(venueListPo.getEleViewAllServicesLnk(), "'View All Services' Link");
			venueListPo.getEleViewAllServicesLnk().click();
			ReportsLibrary.elementDisplay(venueListPo.getEleHideAllServicesLnk(), "'Hide All Services' Link");
			scrollToView(venueListPo.getEleReportProblemLnk());
			Thread.sleep(2000);
			venueListPo.getEleReportProblemLnk().click();
			ReportsLibrary.elementDisplay(venueListPo.getEleReportPopup(), "'Report Problem' popup");
			ReportsLibrary.elementDisplay(venueListPo.getEleFirstNameTxtFld(), "'First Name' Text Field in Report Problem popup");
			Thread.sleep(2000);
			venueListPo.getEleReportCloseIcn().click();
			Thread.sleep(2000);
			venueListPo.getEleFavoriteIcn().click();
			ReportsLibrary.addStep("Clicked on Favourite Icon");
			Thread.sleep(5000);
			ReportsLibrary.elementDisplay(venueListPo.getEleLoginBtn(), "Login Button is displayed");
			driver.navigate().back();
			Thread.sleep(2000);
			//venueListPo.getEleCloseIcn().click();
			ReportsLibrary.addStep("Closed the 'Login' popup");
			venueListPo.getEleRatingIcn().click();
			ReportsLibrary.addStep("Clicked on Rating icons");
			Thread.sleep(2000);
			ReportsLibrary.elementDisplay(venueListPo.getEleLoginBtn(), "Login Button is displayed");
			venueListPo.getEleCloseIcn().click();
			//driver.navigate().back();
			ReportsLibrary.addStep("Closed the 'Login' popup");
			Thread.sleep(5000);
			clickByJavascriptExecutor(venueListPo.getEleShareLnk());
			ReportsLibrary.addStep("Clicked on 'Share' Link");
			ReportsLibrary.elementDisplay(venueListPo.getEleInstrTxt(), "Instrctions");
			Thread.sleep(2000);
			venueListPo.getEleOkBtn().click();
			}	 
		catch(AssertionError e)
			{
			ReportsLibrary.failStep("Test Failed");
				throw e;
			}
		}
	@Test(priority=8,enabled=true,description="Verification of Pagination Functionaliy in the venues list page")
	public void changeLocation()throws Throwable
	{
		homePo=new HomePO(driver);
		venueListPo=new VenueListPO(driver);
		searchResultPO=new SearchResultPO(driver);
		try{
			ReportsLibrary.addStep("Loading the URL");
			launchUrl(GenericLib.getCongigValue(GenericLib.sConfigFile,"FABOGOURL"));
			ReportsLibrary.elementDisplay(homePo.getEleSearchFld(), "Fabogo Home Page");
			homePo.getEleSearchFld().click();
			ReportsLibrary.elementDisplay(homePo.getEleNailServiceOpt(), "Nail Service in list of Services");
			homePo.getEleNailServiceOpt().click();
			Thread.sleep(2000);
			homePo.getEleSearchBtn().click();
			Thread.sleep(10000);
			searchResultPO.getEleChangeLocationLnk().click();
			Thread.sleep(2000);
			homePo.getElePopularLocationsTxt().click();
			homePo.getEleSearchBtn().click();
			Thread.sleep(10000);
			searchResultPO.getEleVenueLnk().click();
			}	 
		catch(AssertionError e)
			{
			ReportsLibrary.failStep("Test Failed");
				throw e;
			}
	}
	
}