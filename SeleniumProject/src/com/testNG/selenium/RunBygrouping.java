package com.testNG.selenium;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class RunBygrouping {
	@Test(groups = {"start"})
	public void startscar() {
		System.out.println("start");
	}
	@Test(groups = {"Gears"})
	public void FirstGear() {
		System.out.println("First Gear");
	}
	@Test(groups = {"stop"})
	public void offthecar() {
		System.out.println("stop");
	}
	@Test(groups = {"start"})
	public void startscar1() {
		System.out.println("start1");
	}
	@Test(groups = {"Gears"})
	public void FirstGear1() {
		System.out.println("Second Gear");
	}
	@Test(groups = {"stop"})
	public void offthecar1() {
		System.out.println("stop1");
	}
	@BeforeGroups(groups = {"stop","Gears"})
	public void ofthecar1() {
		System.out.println("BeforeGroups");
	}
	@AfterGroups(groups = {"stop","Gears"})
	public void afterGroups() {
		System.out.println("AfterGroups");
	}
}
