package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		1st:
//		driver.findElement(By.id("input-firstname")).sendKeys("naveen");
//		driver.findElement(By.id("input-lastname")).sendKeys("kunteti");
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("123456879");
//		driver.findElement(By.id("input-password")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-confirm")).sendKeys("naveen@gmail.com");
//		
//	
		
		
		//webelement + actions(click, sendkeys,gettext, isdisplyed)
		
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By passwordcofirm = By.id("input-confirm");
		
		
    	ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstname, "naveen");
		eleUtil.doSendKeys(lastname, "Kunteti");
		eleUtil.doSendKeys(email, "test@gmail.com");
		eleUtil.doSendKeys(telephone, "123456789");
		eleUtil.doSendKeys(password, "test@123");
		eleUtil.doSendKeys(passwordcofirm, "test@123");
	
	}
//	public static void doSendKeys(String locatorType, String selector,String value) {
//		By locator = getBy(locatorType, selector);
//	    getElement(locator).sendKeys(value);
//	
//	}
//
//    private static By getBy(String locatorType, String selector) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public static void doSendKeys(By locator, String value) {
    	getElement(locator).sendKeys(value);
    	
    }
    public static WebElement getElement(By locator) {
    	return driver.findElement(locator);
    }
    
    }
