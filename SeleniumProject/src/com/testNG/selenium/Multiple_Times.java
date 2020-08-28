package com.testNG.selenium;

import org.testng.annotations.Test;

public class Multiple_Times {
	@Test(invocationCount = 2)
	  public void f(){
		  System.out.println("Test1");
	  }
}
