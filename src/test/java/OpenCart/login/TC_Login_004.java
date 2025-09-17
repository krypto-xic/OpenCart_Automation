package OpenCart.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Login_004 {

	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		String actual_text = driver.findElement(By.xpath("//div[contains(text(), 'Warning: No match for E-Mail Address and/or Password.')]")).getText();
		String expected_text = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actual_text, expected_text);
		
		if (actual_text.equals(expected_text)) {
			System.out.println(actual_text);
			driver.quit();
		}
	}
}
