package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {
         static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
		//presence of Element located
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		email_ele.sendKeys("naveen@gmail.com");
//        driver.findElement(password).sendKeys("test@123");
//    	WebElement login_ele = wait.until(ExpectedConditions.presenceOfElementLocated(loginBtn));
//    	login_ele.click();
		
		doSendKeys(password, "test@123");
		doSendKeys(emailId,"naveen@gmail.com");
		doClick(loginBtn);
	    doSendKeysWithWait(emailId,5,"tom@123.com");
	    doClickWithWait(loginBtn, 2);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	 public static  WebElement getElement(By locator) {
		 return driver.findElement(locator);
	     }
	 public static void doSendKeys(By locator, String value) {
		 getElement(locator).sendKeys(value);
	 }
	 
	 public static void doSendKeysWithWait(By locator,int timeOut,String value) {
		 waitForElementVisible(locator,timeOut).sendKeys(value);
	 }
	 
	 public static WebElement waitForElementVisible(By locator, int timeOut) {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
	   return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void doClickWithWait(By locator, int timeOut) {
		 waitForElementVisible(locator,timeOut).click();
	 }

}
