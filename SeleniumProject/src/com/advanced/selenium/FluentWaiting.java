package com.advanced.selenium;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaiting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		WebElement click = driver.findElement(By.id("finish"));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				if (click.isDisplayed()) {
					return click;
				} else
					return null;
			}
		});
		System.out.println(click.getText());
	}

}
