package RahulShetty;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a.ui-state-default ui-state-highlight ui-state-active ")).click();
		Select adults = new Select(driver.findElement(By.id("Adults")));
		adults.selectByVisibleText("3");
		Select children = new Select(driver.findElement(By.id("Adults")));
		children.selectByVisibleText("3");
		driver.findElement(By.id("MoreOptionsLink")).click();
		Select travel = new Select(driver.findElement(By.id("Class")));
		travel.selectByVisibleText("Economy");
		driver.findElement(By.name("airline")).sendKeys("Indigo");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		driver.close();
		

	}

}
