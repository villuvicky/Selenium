package com.advanced.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	/*
	 * Au3info- record window component objects
	 * 
	 * Build Script -scite.exe
	 * 
	 * Save it- .au3 extension
	 * 
	 * Convert file into .exe by compiling .au3 file
	 * 
	 * Call .exe file with Runtime class in java into your selenium tests
	 */

	protected static WebDriver driver;

	public static void viaSendKeys() {
		
		driver.get("http://www.leafground.com/pages/upload.html"); WebElement
		uploadbutton=driver.findElement(By.name("filename"));
		uploadbutton.sendKeys("C:\\Users\\villu\\Downloads\\testleaf.xlsx");

	}

	public static void viaAutoIt() throws InterruptedException, IOException {

		driver.get("https://smallpdf.com/jpg-to-pdf"); 
		driver.findElement(By.xpath("//button[@class='l3tlg0-0 hrcxSS']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\villu\\Documents\\AutoITfile.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException  {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		viaSendKeys();
		viaAutoIt() ;

	}

}
