package com.advanced.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtils {

	public static void drawBorrder(WebElement element, WebDriver driver ) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static String TitleOfPage( WebDriver driver ) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		String Title=js.executeScript("return document.title;").toString();
		return Title;
	}


	public static void ClickElement(WebElement element, WebDriver driver ) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void GenerateAlert(String message, WebDriver driver ) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
	}
	
	public static void ScrollDown(WebDriver driver ) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void ScrollUp(WebDriver driver ) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}
	
	public static void MoveToElements(WebDriver driver ,WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}

	
	public static void ZoomPage(WebDriver driver ) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");
}
}
