package com.testNG.selenium;

import org.testng.annotations.Test;

public class TimeOuts {
	@Test(timeOut = 2000)
	  public void f() throws InterruptedException{
		Thread.sleep(3000);
		  System.out.println("Test1");
	  }
}
