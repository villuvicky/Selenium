package com.advanced.selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Screenshot {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://www.leafground.com/pages/Window.html");
		Robot robot= new Robot();
		Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle= new Rectangle(size);
		BufferedImage image= robot.createScreenCapture(rectangle);
		File file= new File("C:\\Users\\villu\\Documents\\full image.png");
		ImageIO.write(image, "png", file);
	}

}
