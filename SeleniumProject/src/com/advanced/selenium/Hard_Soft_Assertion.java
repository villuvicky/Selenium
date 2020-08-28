package com.advanced.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Soft_Assertion {

	/*
	 * @Test public void HardAssert() { System.out.println("Before Assertion");
	 * Assert.assertEquals(true, false); System.out.println("After Assertion");
	 * 
	 * }
	 */
	
	@Test
	public void Soft_Assertion() {
		SoftAssert softAssert= new SoftAssert();
		System.out.println("Before Assertion");
		softAssert.assertEquals(false, true);
		System.out.println("After Assertion");
		
	}
	
}
