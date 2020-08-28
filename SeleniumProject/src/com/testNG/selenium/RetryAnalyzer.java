package com.testNG.selenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
int failed=0;
int total=2;
	@Override
	public boolean retry(ITestResult result) {
		if(failed<total) {
			failed++;
			return true;
		}
		return false;
	}

}
