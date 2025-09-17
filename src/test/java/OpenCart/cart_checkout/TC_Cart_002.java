package OpenCart.cart_checkout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Cart_002 {

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
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")).sendKeys("2");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		
	}
}
