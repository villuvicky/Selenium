package com.testNG.selenium;

import org.testng.annotations.Test;

public class SkipTestCase {
	@Test(priority =0)
	public void startscar() {
		System.out.println("start");
	}
	@Test(priority = 1,enabled = false)
	public void FirstGear() {
		System.out.println("FirstGear");
	}
	@Test(priority = 2)
	public void offthecar() {
		System.out.println("stop");
	}
	}

