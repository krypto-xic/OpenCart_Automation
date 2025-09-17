package OpenCart.cart_checkout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Cart_005 {

	@Test
	public void cart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("manav1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("manav@123");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		driver.findElement(By.name("search")).sendKeys("HP LP3065");
		driver.findElement(By.xpath("//button[@class= 'btn btn-default btn-lg']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(), 'Add to Cart')]")).click();
		driver.findElement(By.id("button-cart")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span")).click();
		driver.findElement(By.linkText("Checkout")).click();
		driver.findElement(By.id("button-payment-address")).click();
		
		driver.findElement(By.id("button-shipping-address")).click();
		driver.findElement(By.id("button-shipping-method")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.id("button-payment-method")).click();
		driver.findElement(By.id("button-confirm")).click();
		
		String actual_result = driver.findElement(By.id("content")).getText();
		System.out.println(actual_result);
		String expected_result = "Your Order Has Been Place!";
		actual_result.contains(expected_result);
		
	}
}
