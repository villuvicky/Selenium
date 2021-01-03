package com.testNG.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependancy {
	@Test()
	public void startscar() {
		System.out.println("start");
	}
	@Test(groups = "Name")
	public void SecondGear() {
		System.out.println("SecondGear");
		Assert.assertFalse(true);
	}
	@Test(dependsOnMethods ="startscar")
	public void FirstGear() {
		System.out.println("FirstGear");
	}
	@Test(dependsOnGroups = "Name")
	public void offthecar() {
		System.out.println("stop");
	}
}
