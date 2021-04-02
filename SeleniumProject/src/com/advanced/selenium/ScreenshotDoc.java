package com.advanced.selenium;

import java.io.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDoc {

	static  File destination;
	static String path;
	public static void getScreenshot() throws IOException {

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://www.leafground.com/pages/Window.html");	
		TakesScreenshot screenshot=(TakesScreenshot) driver1;
		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
		String name="step_2";
		path="C:\\Users\\villu\\Documents\\"+name+"\\2.png";
		destination= new File(path);
		if(!destination.exists())
		{
			destination.getParentFile().mkdirs();
			destination.createNewFile();
			FileHandler.copy(sourcefile, destination);

		}
		driver1.close();

	}
	
	public static void Docs() throws IOException, InvalidFormatException{
		
		getScreenshot();
		XWPFDocument docx = new XWPFDocument();
		XWPFParagraph par = docx.createParagraph();
		XWPFRun run = par.createRun();
		InputStream pic = new FileInputStream(path);
		System.out.println(destination.getAbsolutePath());
		run.addPicture(pic, XWPFDocument.PICTURE_TYPE_JPEG, path, Units.toEMU(400), Units.toEMU(200));
		run.addBreak();
		InputStream pic2 = new FileInputStream(path);
		XWPFParagraph par2 = docx.createParagraph();
		XWPFRun run2 = par2.createRun();
		run2.addPicture(pic2, XWPFDocument.PICTURE_TYPE_JPEG, path, Units.toEMU(450), Units.toEMU(250));
		FileOutputStream out = new FileOutputStream("C:\\Users\\villu\\Documents\\simple1.docx"); 
		docx.write(out); 
		out.close(); 
		pic.close();
		docx.close();
		
	}

	public static void main(String[] args) throws InvalidFormatException, IOException  {
		// TODO Auto-generated method stub

		Docs();

	}

}
