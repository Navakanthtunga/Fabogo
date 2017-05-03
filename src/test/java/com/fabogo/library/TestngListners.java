package com.fabogo.library;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;


public class TestngListners implements ITestListener{
	static Date date = new Date();
    static SimpleDateFormat sdtf=new SimpleDateFormat("dd-MM-yy_hh_mm_ss");
    static String sTime = sdtf.format(date);
	public static String reportDestination =GenericLib.sDirPath+"\\reports\\FabogoReports_"+sTime+".html";
    private ExtentReports reporter =  new ExtentReports(reportDestination, true, DisplayOrder.NEWEST_FIRST, NetworkMode.OFFLINE, Locale.ENGLISH);
    public static ExtentTest testReporter;
    
	public void onTestStart(ITestResult result) {
		testReporter = reporter.startTest(result.getMethod().getMethodName(),result.getMethod().getDescription());
	}
	public void onTestSuccess(ITestResult result) {
		testReporter.log(LogStatus.PASS, "Test PASSED");
        reporter.endTest(testReporter);
        reporter.flush();	
	}
	public void onTestFailure(ITestResult result) {
		try{
		capture(BaseLib.driver,result.getName());
		String screenShotPath = capture(BaseLib.driver, result.getName().toString());
		testReporter.log(LogStatus.FAIL, "Below is the screenshot: " + testReporter.addScreenCapture(screenShotPath));
		testReporter.log(LogStatus.FAIL, result.getThrowable());
		}catch (Exception e) {
			testReporter.log(LogStatus.FAIL, " Unable to get the Screenshot");
		}
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		reporter.loadConfig(new File(GenericLib.sDirPath+"\\extent-config.xml"));
		reporter.addSystemInfo("Created By: ", "Test Yantra");
	}
	public void onFinish(ITestContext context) {
		reporter.endTest(testReporter);
		reporter.flush();	
	}

	public static String capture(WebDriver driver,String screenShotName) throws IOException
    {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = GenericLib.sDirPath+"\\screenshots\\"+screenShotName+".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);        
        return dest;
    }
}
