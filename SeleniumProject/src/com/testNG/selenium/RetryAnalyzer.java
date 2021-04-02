package com.testNG.selenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	int retryCount =0;
	int maxRetryCount =3;
	
	public boolean retry(ITestResult result) {
		if(((!result.isSuccess())&&retryCount <maxRetryCount)) {
			retryCount ++;
			return true;
		}
		return false;
	}

}
