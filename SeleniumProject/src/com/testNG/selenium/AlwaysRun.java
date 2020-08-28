package com.testNG.selenium;

import org.testng.annotations.Test;

public class AlwaysRun {
	@Test(timeOut = 2000)
	  public void f() throws InterruptedException{
		Thread.sleep(3000);
		  System.out.println("Test1");
	  }
	@Test(dependsOnMethods = "f",alwaysRun = true)
	public void f2() {
		System.out.println("Test2");
		
	}
	
}
