package com.testNG.selenium;

import org.testng.annotations.Test;

public class RunBygrouping {
	@Test(groups = {"start"})
	public void startscar() {
		System.out.println("start");
	}
	@Test(groups = {"Firstgear"})
	public void FirstGear() {
		System.out.println("FirstGear");
	}
	@Test(groups = {"stop"})
	public void offthecar() {
		System.out.println("stop");
	}
	@Test(groups = {"start"})
	public void startscar1() {
		System.out.println("start1");
	}
	@Test(groups = {"Firstgear"})
	public void FirstGear1() {
		System.out.println("FirstGear1");
	}
	@Test(groups = {"stop"})
	public void offthecar1() {
		System.out.println("stop1");
	}
}
