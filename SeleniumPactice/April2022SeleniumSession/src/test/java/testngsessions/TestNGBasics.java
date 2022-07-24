package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGBasics {
	 
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}

	@Test
	public void firstNameTest() {
		WebElement firEle = driver.findElement(By.id("input-firstname"));
		firEle.sendKeys("Naveen");
	}
	@Test
	public void lastName() {
		WebElement lastEle = driver.findElement(By.id("input-lastname"));
		lastEle.sendKeys("Kunteti");
	}
	@Test
	public void emailTest() {
		WebElement emailEle = driver.findElement(By.id("input-email"));
		emailEle.sendKeys("naveen@gmail.com");
	}
	@Test
	public void telePhoneNumTest() {
		WebElement telePhone = driver.findElement(By.id("input-telephone"));
		telePhone.sendKeys("12345678990");
	}
	@Test
	public void passwordTest() {
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("test@123");
	}
	@Test
	public void confirmTest() {
		WebElement conPass = driver.findElement(By.id("input-confirm"));
		conPass.sendKeys("test@123");
	}
	@Test
	public void continueButton() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@AfterTest
	public void assertion() {
		WebElement alertMesg = driver.findElement(By.xpath("//div[text()=' Warning: You must agree to the Privacy Policy!']"));
	    String expectedMesg = " Warning: You must agree to the Privacy Policy!";
	    System.out.println(alertMesg);
	    Assert.assertEquals(alertMesg, expectedMesg);
	  
	}
	
	
}
