package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {
      
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
        By lastName = By.id("input-lastname");
        By email = By.id("input-email");
        By telePhone = By.id("input-telephone");
        By password = By.id("input-password");
        By passwordConfirm = By.id("input-confirm");
        By clickContinue = By.xpath("//input[@value='Continue']");
        
        
    doActionsSendKeys(firstName,"Naveen");
    doActionsSendKeys(lastName, "Kunteti");
    doActionsSendKeys(email,"test@gmail.com");
    doActionsSendKeys(telePhone,"1222222478");
    doActionsSendKeys(password,"test@123");
    doActionsSendKeys(passwordConfirm,"test@123");
    doActionsClick(clickContinue);
    
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
     
	public static void doActionsSendKeys(By locator , String value ) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator),value).perform();
		}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	
	
	
	
	
}
