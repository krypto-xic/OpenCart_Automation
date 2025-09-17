package OpenCart.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Login_001 {

	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("manav1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("manav@123");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		boolean we = driver.getPageSource().contains("Success: Your account has been logged in successfully");
		
		
		if (we) {
			System.out.println(we);
			driver.quit();
		}
	}
}

