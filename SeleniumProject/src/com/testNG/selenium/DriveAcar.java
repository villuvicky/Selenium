package com.testNG.selenium;



import org.testng.Assert;
import org.testng.annotations.Test;

public class DriveAcar {
	@Test(priority =0,retryAnalyzer = RetryAnalyzer.class)
	public void startscar() {
		System.out.println("start");
	}
	@Test(priority = 1,retryAnalyzer = RetryAnalyzer.class)
	public void FirstGear() {
		System.out.println("FirstGear");
		Assert.assertEquals(false, true);
	}
	@Test(priority = 2,retryAnalyzer = RetryAnalyzer.class)
	public void offthecar() {
		System.out.println("stop");
	}
}
