package PoMApproach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private static  WebDriver driver;
	private static By Button= By.id("MP_link");
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		HomePage.driver= driver;
	}

	
	public  static BuyPage MarketPlace() {
		
		driver.findElement(Button).click();
		return new BuyPage(driver);
	}
}
