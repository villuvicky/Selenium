package com.advanced.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123"+Keys.ENTER);


		Actions actions= new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[text()='Admin']")));
		actions.moveToElement(driver.findElement(By.
				xpath("//*[text()='User Management']")));
		actions.moveToElement(driver.findElement(By.xpath("//*[text()='Users']")));
		actions.build().perform();
	driver.findElement(By.xpath("//*[text()='Users']")).click();
		Select selectrole=new Select(driver.findElement(By.name("searchSystemUser[userType]")));
	selectrole.selectByIndex(1);

		Select selectstatus=new Select(driver.findElement(By.name("searchSystemUser[status]")));
		selectstatus.selectByIndex(1);
		driver.findElement(By.id("searchBtn")).click(); String
		User=driver.findElement(By.xpath("//tr/td[3]")).getText(); 
		String Status=driver.findElement(By.xpath("//tr/td[5]")).getText();
		System.out.println(User); System.out.println(Status);
		Assert.assertEquals(User, "Admin"); Assert.assertEquals(Status, "Enabled");

		WebDriverWait wait= new WebDriverWait(driver,10);
		WebElement welcome_button= wait.until(ExpectedConditions.elementToBeClickable((By.id("welcome"))));
		welcome_button.click();
		WebDriverWait wait2= new WebDriverWait(driver,10);
		WebElement logout= wait2.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[text()='Logout']"))));
		logout.click();

	}

}
