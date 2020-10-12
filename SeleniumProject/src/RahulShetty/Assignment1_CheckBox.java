package RahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement box1 = driver.findElement(By.id("checkBoxOption1"));
		box1.click();
		Thread.sleep(4000);
		Assert.assertTrue(box1.isSelected());
		box1.click();
		Assert.assertFalse(box1.isSelected());
		List<WebElement> elements = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println(elements.size());
		driver.close();
	}

}
