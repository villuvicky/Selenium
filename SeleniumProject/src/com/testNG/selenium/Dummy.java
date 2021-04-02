package com.testNG.selenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Dummy implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
