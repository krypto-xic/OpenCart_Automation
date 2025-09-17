package OpenCart.cart_checkout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Cart_001 {

	@Test
	public void cart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("HP LP3065");
		driver.findElement(By.xpath("//button[@class= 'btn btn-default btn-lg']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(), 'Add to Cart')]")).click();
		driver.findElement(By.id("button-cart")).click();
		
		String actual_result = driver.findElement(By.xpath("//div[contains(text(), 'Success: You have added ')]")).getText();
		String expected_result = "Success: You have added HP LP3065 to your shopping cart!";
		Assert.assertEquals(actual_result, expected_result);
		
	}
}
