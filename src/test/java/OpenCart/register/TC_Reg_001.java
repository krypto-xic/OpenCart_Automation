package OpenCart.register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Reg_001{

	@Test
	public void register() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Manav");
		driver.findElement(By.id("input-lastname")).sendKeys("Vishwakarma");
		driver.findElement(By.id("input-email")).sendKeys(generateNewEmail());
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("manav12");
		driver.findElement(By.id("input-confirm")).sendKeys("manav12");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.className("btn-primary")).click();
		
		driver.findElement(By.linkText("Logout")).isDisplayed();
		
		String expectedResult = "Your Account Has Been Created!";
		Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(), 'Your Account Has Been Created!')]")).getText(), expectedResult);
		

//		driver.quit();
	}
	
	
	public String generateNewEmail() {
		
		int rnum = (int) (Math.random()*10000);
		String newEmail = "manav" + rnum + "@gmail.com";
		return newEmail;
	}
}

