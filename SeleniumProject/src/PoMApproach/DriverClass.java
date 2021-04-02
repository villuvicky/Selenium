package PoMApproach;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverClass {

	public  static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<>();
	
	

	@BeforeSuite
	public  WebDriver OpenDriver() {
		
		WebDriverManager.chromedriver().setup();
		tlDriver.set(new ChromeDriver());
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {

		return tlDriver.get();
	}
}
