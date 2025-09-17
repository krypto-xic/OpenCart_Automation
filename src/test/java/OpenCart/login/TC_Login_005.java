package OpenCart.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Login_005 {

	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.linkText("Forgotten Password")).click();
		
		String actual_text = driver.findElement(By.xpath("//h1[contains(text(), 'Forgot Your Password?')]")).getText();
		String expected_text = "Forgot Your Password?";
		Assert.assertEquals(actual_text, expected_text);
		
		if (actual_text.equals(expected_text)) {
			System.out.println(actual_text);
			driver.quit();
		}
	}
}
