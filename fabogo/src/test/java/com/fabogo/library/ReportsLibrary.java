package com.fabogo.library;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class ReportsLibrary {
	public static void elementDisplay(WebElement element, String elementName) 
	{
		try 
	    {
	        if(element.isDisplayed()){
	       TestngListners.testReporter.log(LogStatus.PASS,elementName+" is displayed");
	        }
	    } 
	    catch (Exception e) 
	    {
	    	TestngListners.testReporter.log(LogStatus.FAIL,elementName+" is not displayed");
	    }
	}
	public static void addStep(String StepDescription){
		TestngListners.testReporter.log(LogStatus.PASS,StepDescription);
	}
	public static void failStep(String StepDescription){
		TestngListners.testReporter.log(LogStatus.FAIL,StepDescription);
	}
}
