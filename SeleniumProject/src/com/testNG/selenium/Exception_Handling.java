package com.testNG.selenium;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Exception_Handling {
	@Test(timeOut = 2000,expectedExceptions =ThreadTimeoutException.class)
	  public void f() throws InterruptedException{
		Thread.sleep(3000);
		  System.out.println("Test1");
	  }
}
