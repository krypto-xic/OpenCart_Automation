package OpenCart.product_search;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Search_002 {

	@Test
	public void search() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("xyz123");
		driver.findElement(By.xpath("//button[@class= 'btn btn-default btn-lg']")).click();
		
		String actual_result = driver.findElement(By.xpath("//p[contains(text(), 'There')]")).getText();
		String expected_result = "There is no product that matches the search criteria.";
		
		Assert.assertEquals(actual_result, expected_result);
	}
}
