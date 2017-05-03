package com.fabogo.library;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseLib{
	public static WebDriver driver;
	WebDriverWait wait=null;
	
	@BeforeMethod
	public void setUp(){
		try{
		if(GenericLib.getCongigValue(GenericLib.sConfigFile, "BROWSER").equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",GenericLib.sDirPath+"\\resources\\exe\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(GenericLib.getCongigValue(GenericLib.sConfigFile, "BROWSER").equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",GenericLib.sDirPath+"\\resources\\exe\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		}
		catch(AssertionError e){
			ReportsLibrary.failStep("Problem in launching driver");
		}
	}
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	public void launchUrl(String url){
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void mouseHoverByJavascriptExecutor(WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    String strJavaScript = "var element = arguments[0];"
	            + "var mouseEventObj = document.createEvent('MouseEvents');"
	            + "mouseEventObj.initEvent( 'mouseover', true, true );"
	            + "element.dispatchEvent(mouseEventObj);";
	    js.executeScript(strJavaScript, element); 
	}
	public void movetoelementjs(WebElement element){
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].onmouse()", element);
		
}
	public void visibilityOfElementWait(WebElement webElement,int waitTime,String elementName)
	{
	     wait = new WebDriverWait(driver, waitTime);
	     wait.until(ExpectedConditions.elementToBeClickable(webElement));
	} 
	public void scrollToView(WebElement element){
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	public void clickByJavascriptExecutor(WebElement element){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	public void sendDataByJavascriptExecutor(WebElement element,String testData){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].value='"+testData+"'",element);
	}
}
