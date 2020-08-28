package com.advanced.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadcheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/download.html");
		WebElement downloadlink=driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/a[1]"));
		downloadlink.click();
		Thread.sleep(4000);
		File filelocation= new File("C:\\Users\\villu\\Downloads");
		File[] list=filelocation.listFiles();
		for (File file : list) {
			if(file.getName().equals("testleaf.xlsx")) {
				System.out.println("downloaded");
			}
		}
	}

}
