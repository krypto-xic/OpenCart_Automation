package OpenCart.product_search;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Search_004 {

	@Test
	public void search() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("Product 18");
		driver.findElement(By.xpath("//button[@class= 'btn btn-default btn-lg']")).click();	
		
		driver.getPageSource().contains("Product 18");
		
	}
	
}
