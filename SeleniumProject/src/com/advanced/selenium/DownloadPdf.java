package com.advanced.selenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadPdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location=System.getProperty("user.dir")+"\\Downloads\\";
		HashMap<Object, Object> preferences= new HashMap<>();
		preferences.put("download.default_directory", location);
		preferences.put("plugins.always_open_pdf_externally", true);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
	}

}
