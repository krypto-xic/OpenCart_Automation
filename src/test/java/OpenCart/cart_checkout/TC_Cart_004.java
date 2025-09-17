package OpenCart.cart_checkout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Cart_004 {

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
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span")).click();
		driver.findElement(By.linkText("Checkout")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/input")).click();
		driver.findElement(By.id("button-account")).click();
		driver.findElement(By.id("input-payment-firstname")).sendKeys("Manav");
		driver.findElement(By.id("input-payment-lastname")).sendKeys("Vishwakarma");
		driver.findElement(By.id("input-payment-email")).sendKeys("manav@gmail.com");
		driver.findElement(By.id("input-payment-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-payment-address-1")).sendKeys("Bandra");
		driver.findElement(By.id("input-payment-city")).sendKeys("Mumbai");
		driver.findElement(By.id("input-payment-postcode")).sendKeys("678956");
		WebElement we = driver.findElement(By.id("input-payment-country"));
		Select country = new Select(we);
		country.selectByVisibleText("India");
		
		WebElement we1 = driver.findElement(By.id("input-payment-zone"));
		Select state = new Select(we1);
		state.selectByVisibleText("Maharashtra");
		
		driver.findElement(By.id("button-guest")).click();
		driver.findElement(By.id("button-shipping-method")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.id("button-payment-method")).click();
		driver.findElement(By.id("button-confirm")).click();
		
		String actual_result = driver.findElement(By.xpath("//*/h1[contains(text(), 'Your order has been placed!')]")).getText();
		System.out.println(actual_result);
		String expected_result = "Your order has been placed!";
		Assert.assertEquals(actual_result, expected_result);
		
	}
}
