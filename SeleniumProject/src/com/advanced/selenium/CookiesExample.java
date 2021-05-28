package com.advanced.selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		Set<Cookie> Cookies=driver.manage().getCookies();
		System.out.println(Cookies.size());
		for (Cookie cookie : Cookies) {
			System.out.println("Cookie Name is "+cookie.getName()+" and Value is "+cookie.getValue()); 
		}
		
		System.out.println("***************************");
		
		Cookie cookie= new Cookie("New one", "158742");
		driver.manage().addCookie(cookie);
		Cookies=driver.manage().getCookies();
		System.out.println(Cookies.size());
		for (Cookie cookiee : Cookies) {
			System.out.println("Cookie Name is "+cookiee.getName()+" and Value is "+cookiee.getValue()); 
		}
		
		System.out.println("***************************");
		
		driver.manage().deleteCookieNamed("_gid");
		Cookies=driver.manage().getCookies();
		System.out.println(Cookies.size());
		
		System.out.println("***************************");
		
		driver.manage().deleteAllCookies();
		Cookies=driver.manage().getCookies();
		System.out.println(Cookies.size());
		for (Cookie cookiee : Cookies) {
			System.out.println("Cookie Name is "+cookiee.getName()+" and Value is "+cookiee.getValue()); 
		}
	}

}
