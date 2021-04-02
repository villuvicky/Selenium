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
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://www.leafground.com/pages/Window.html");	
		TakesScreenshot screenshot=(TakesScreenshot) driver1;
		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
		String name="steps2";
		String path="C:\\Users\\villu\\Documents\\"+name+"\\2.png";
		File destinstion= new File(path);
		if(!destinstion.exists())
		{
		destinstion.getParentFile().mkdirs();
		destinstion.createNewFile();
		FileHandler.copy(sourcefile, destinstion);
		}
		
		
	}

}
