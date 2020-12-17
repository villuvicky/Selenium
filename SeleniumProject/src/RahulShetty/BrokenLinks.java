package RahulShetty;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> AllLinks=driver.findElements(By.xpath("//li[@class='gf-li']//a"));
		SoftAssert asserts= new SoftAssert();
		for (WebElement Link : AllLinks) {
			 String url=Link.getAttribute("href");
			 System.out.println(url);
				URL URl= new URL(url);
				HttpURLConnection  connection=(HttpURLConnection) URl.openConnection();
				connection.setRequestMethod("GET");	
				connection.connect();
				int statusCode=connection.getResponseCode();
				System.out.println(statusCode);
				asserts.assertTrue(statusCode<400, Link.getText()+ " is broken link");
		}
		asserts.assertAll();//apply assert for all
		driver.close();
	}

}
