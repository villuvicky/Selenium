package RahulShetty;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_MultiWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		String currentWindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> Windows = driver.getWindowHandles();
		for (String New : Windows) {
			driver.switchTo().window(New);
		}
		String NewText = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		System.out.println(NewText);
		driver.close();
		driver.switchTo().window(currentWindow);
		String OldText = driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
		System.out.println(OldText);

	}

}
