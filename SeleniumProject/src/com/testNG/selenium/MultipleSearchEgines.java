package com.testNG.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MultipleSearchEgines {
	WebDriver driver;
	long starttime;
	long endtime;
	@BeforeSuite
	public void openbrowse() {
		starttime=System.currentTimeMillis();
		driver= new ChromeDriver();
	}@Test
	public void opengoogle(){
		driver.get("https://www.google.co.in/");
	}@Test
	public void openbing(){
		driver.get("https://www.bing.com/");
	}@Test
	public void openyahoo(){
		driver.get("https://in.yahoo.com/");
	}
	@AfterSuite
	public void close() {
		driver.quit();
		endtime=System.currentTimeMillis();
		long Total=endtime-starttime;
		System.out.println(Total);
	}
}
