package com.advanced.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot_selenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://www.leafground.com/pages/Window.html");	
		TakesScreenshot screenshot=(TakesScreenshot) driver1;
		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
		File destinstion= new File("C:\\Users\\villu\\Documents\\image.png");
		FileHandler.copy(sourcefile, destinstion);
		
	}

}
