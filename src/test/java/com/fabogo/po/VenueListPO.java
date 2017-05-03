package com.fabogo.po;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VenueListPO {
	WebDriver driver=null;

	public VenueListPO(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='mt5 bb bt pt10 pb10']//span")
	private WebElement eleSortByIcn;
	public WebElement getEleSortByIcn(){
		return eleSortByIcn;
	}
	@FindBy(xpath="//a[contains(text(),'The Little Hair Salon')]")
	private WebElement eleTheLittleHairSalonLnk;
	public WebElement getEleTheLittleHairSalonLnk(){
		return eleTheLittleHairSalonLnk; 
	}	
	@FindBy(id="lnk-to-display-all-services")
	private WebElement eleViewAllServicesLnk;
	public WebElement getEleViewAllServicesLnk(){
		return eleViewAllServicesLnk;
	}
	@FindBy(id="lnk-to-hide-all-services")
	private WebElement eleHideAllServicesLnk;
	public WebElement getEleHideAllServicesLnk(){
		return eleHideAllServicesLnk;
	}
	@FindBy(xpath="//div[text()=' PHONE NUMBER']")
	private WebElement elePhoneNumberBtn;
	public WebElement getElePhoneNumberBtn(){
		return elePhoneNumberBtn;
	}
	@FindBy(xpath="//p[text()='Prior bookings are recommended']")
	private WebElement elePhoneNumberInstructionTxt;
	public WebElement getElePhoneNumberInstructionTxt(){
		return elePhoneNumberInstructionTxt;
	}
	@FindBy(id="report-link")
	private WebElement eleReportProblemLnk;
	public WebElement getEleReportProblemLnk(){
		return eleReportProblemLnk;
	}
	
	@FindBy(xpath="//div[@class='modal-content']")
	private WebElement eleReportPopup;
	public WebElement getEleReportPopup(){
		return eleReportPopup;
	}
	@FindBy(id="name")
	private WebElement eleFirstNameTxtFld;
	public WebElement getEleFirstNameTxtFld(){
		return eleFirstNameTxtFld;
	}
	@FindBy(xpath="//i[@class='fa fa-heart']")
	private WebElement eleFavoriteIcn;
	public WebElement getEleFavoriteIcn(){
		return eleFavoriteIcn;
	}
	@FindBy(id="btn-login")
	private WebElement eleLoginBtn;
	public WebElement getEleLoginBtn(){
		return eleLoginBtn;
	}	
	@FindBy(xpath="//button[@class='mfp-close']")
	private WebElement eleCloseIcn;
	public WebElement getEleCloseIcn(){
		return eleCloseIcn;
	}	
	@FindBy(xpath="//a[@data-rating-value='4.0']")
	private WebElement eleRatingIcn;
	public WebElement getEleRatingIcn(){
		return eleRatingIcn;
	}	
	@FindBy(xpath="//a[@class='sharable btn mr2 btn-default btn']")
	private WebElement eleShareLnk;
	public WebElement getEleShareLnk(){
		return eleShareLnk;
	}	
	@FindBy(xpath="//div[@class='bootbox-body']")
	private WebElement eleInstrTxt;
	public WebElement getEleInstrTxt(){
		return eleInstrTxt;
	}
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement eleOkBtn;
	public WebElement getEleOkBtn(){
		return eleOkBtn;
	}
	@FindBy(xpath="//button[@class='bootbox-close-button close']")
	private WebElement eleReportCloseIcn;
	public WebElement getEleReportCloseIcn(){
		return eleReportCloseIcn;
	}
	@FindBy(xpath="//b[text()='MORE FILTERS']")
	private WebElement eleMoreFiltersTxt;
	public WebElement getEleMoreFiltersTxt(){
		return eleMoreFiltersTxt;
	}
	@FindBy(xpath="(//b[text()='MORE FILTERS']/..//following-sibling::ul//li[@class='bb pb5 pt5']//span)[1]")
	private WebElement eleOpenNowChBx;
	public WebElement getEleOpenNowChBx(){
		return eleOpenNowChBx;
	}
	@FindBy(xpath="(//b[text()='MORE FILTERS']/..//following-sibling::ul//li[@class='bb pb5 pt5']//span)[4]")
	private WebElement eleWiFiChBx;
	public WebElement getEleWiFiChBx(){
		return eleWiFiChBx;
	}
	@FindBy(xpath="//ul[@class='pagination']//li")
	private WebElement elePaginationSct;
	public WebElement getElePaginationSct(){
		return elePaginationSct;
	}
	@FindBy(xpath="//ul[@class='pagination']//li")
	private List<WebElement> elePaginationBx;
	public List<WebElement> getElePaginationBx(){
		return elePaginationBx;
	}
	@FindBy(xpath="//a[@rel='next']")
	private WebElement eleNextIcn;
	public WebElement getEleNextIcn(){
		return eleNextIcn;
	}
	@FindBy(xpath="(//a[@class='result-title fs80'])[1]")
	private WebElement eleFeaturedVenue;
	public WebElement getEleFeaturedVenue(){
		return eleFeaturedVenue;
	}
}
