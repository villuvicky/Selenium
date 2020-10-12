package RahulShetty;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");
		WebElement Parent_Frame= driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(Parent_Frame);
		WebElement Middle_Frame= driver.findElement(By.name("frame-middle"));
		driver.switchTo().frame(Middle_Frame);
		String text= driver.findElement(By.id("content")).getText();
		System.out.println(text);		
	}

}
