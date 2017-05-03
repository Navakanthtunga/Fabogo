package com.fabogo.library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericLib {
	static public String sDirPath = System.getProperty("user.dir");
	public static String sConfigFile = sDirPath+"\\Config.properties";
	
	public static String getCongigValue(String sFile, String sKey) {
		Properties prop = new Properties();
		String sValue = null;
		try {
			InputStream input = new FileInputStream(sFile);
			prop.load(input);
			sValue = prop.getProperty(sKey);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sValue;
	}
	public static String toReadExcelData(String filePath,String sheetName,int rowNum,int cellNum)
	 {
		 String dataNew=null;
		 try{
		 	FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = (Workbook) WorkbookFactory.create(fis);
			Sheet sht = wb.getSheet(sheetName);
			dataNew=sht.getRow(rowNum).getCell(cellNum).getStringCellValue();
		 }
		 catch (Exception e)
	      {
	       
	      }
		 return dataNew ;
}
	public static String browserName(){
	    Capabilities cap = ((RemoteWebDriver) BaseLib.driver).getCapabilities();
	    String browser = cap.getBrowserName().toLowerCase();
	    return browser;
	}
	public static String browserVersion(){
	    Capabilities cap = ((RemoteWebDriver) BaseLib.driver).getCapabilities();
	    String version = cap.getVersion().toString();
	    return version;
	}
}
