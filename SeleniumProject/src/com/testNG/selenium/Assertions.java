package com.testNG.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	@Test
	public void value_check() {
		String name="vicky";
		int age=23;
		boolean work=false;
		Assert.assertEquals(name, "vicy");
		Assert.assertNotEquals(age, "23");
		Assert.assertFalse(work,"False");
		
	}

}
