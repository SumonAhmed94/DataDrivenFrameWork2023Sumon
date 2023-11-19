package com.facebook.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.facebook.base.BaseTest;

public class FacebookListener implements ITestListener{
//  listener have only declaration no implementation
	@Override
	public void onTestStart(ITestResult result) {
	String methodName =result.getName();
	System.out.println(methodName+" >>>>>>method started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName =result.getName();
		System.out.println(methodName+" >>>>>method passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName =result.getName();
		System.out.println(methodName+" >>>>>>method failed");
		screenShot(methodName);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName =result.getName();
		System.out.println(methodName+" >>>>>>method skipped");
		screenShot(methodName);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String methodName =result.getName();
		System.out.println(methodName+" >>>>>>method fail with success");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String methodName =result.getName();
		System.out.println(methodName+" >>>>>>method fail with time");
	}

	@Override
	public void onStart(ITestContext context) {
		String testName=context.getName();
		System.out.println(testName+">>>>>>Tests Started");
	}

	@Override
	public void onFinish(ITestContext context) {
		String testName=context.getName();
		System.out.println(testName+">>>>>>Tests Finished");
	}
	public void screenShot(String screenShotName) {
		
		
		   BaseTest b = new BaseTest();
			WebDriver driver=b.openApp();
			//Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			//Move image file to new destination
			     //roll up
			long time=System.currentTimeMillis();
			String fileWithPath="screenShot/"+time+screenShotName+".png";
			File DestFile=new File(fileWithPath);
			   //roll over
			//String detFilePath=System.getProperty("user.dir")+"\\ScreenShots\\"+"test"+".png";
			//File DestFile=new File(detFilePath);
			
			//Copy file at destination
			try {
				FileUtils.copyFile(SrcFile, DestFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
			}

		
	}