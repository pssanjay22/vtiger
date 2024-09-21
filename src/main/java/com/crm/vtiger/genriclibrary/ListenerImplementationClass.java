package com.crm.vtiger.genriclibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementationClass implements ITestListener{

	public TakesScreenshot driver;

	public void onTestFailure(ITestResult result ) {
		
		String failedTestScriptName = result.getMethod().getMethodName();
		WebDriver driver = BaseClass.sdriver;
		TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
		File src = screenshotDriver.getScreenshotAs(OutputType.FILE);
		String timestamp = new Date().toString().replaceAll(":", "-");
		File dest = new File("./screenshot/" + failedTestScriptName + "_" + timestamp + ".png");
	      try {
	            FileUtils.copyFile(src, dest);
	            System.out.println("Screenshot saved successfully: " + dest.getAbsolutePath());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    
	}
}
