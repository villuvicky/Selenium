package com.testNG.selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener {
	
			
    public void onFinish(ITestContext arg0) {					
    	System.out.println("onFinish");			
        		
    }		

    		
    public void onStart(ITestContext arg0) {					
    	System.out.println("onStart");			
        		
    }		

    		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        				
    	System.out.println("onTestFailedButWithinSuccessPercentage");		
    }		

    		
    public void onTestFailure(ITestResult arg0) {					
        				
    	System.out.println("onTestFailure");		
    }		

    		
    public void onTestSkipped(ITestResult arg0) {					
    	System.out.println("onTestSkipped");				
        		
    }		

    		
    public void onTestStart(ITestResult arg0) {					
    	System.out.println("onTestStart");				
        		
    }		

    		
    public void onTestSuccess(ITestResult arg0) {					
    	System.out.println("onTestSuccess");				
        		
    }
}