package com.testNG.selenium;

import org.testng.annotations.Test;

public class Dependancy {
	@Test()
	public void startscar() {
		System.out.println("start");
	}
	@Test(dependsOnMethods ="startscar")
	public void FirstGear() {
		System.out.println("FirstGear");
	}
	@Test()
	public void offthecar() {
		System.out.println("stop");
	}
}
