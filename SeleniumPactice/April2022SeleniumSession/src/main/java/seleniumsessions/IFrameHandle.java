package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameHandle {
        
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
//		
//		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("2022");
//		
//		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Corolla,Toyota");
//		
//		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("K-120");
//		
//		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Metalic Gray");
//		
//		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("20");
//		
//		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("123345");
//		
//		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Rajendra");
//		
//		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("333,Lancaster ave");
//		
//		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("apt no:307");
//		
//		driver.findElement(By.id("RESULT_TextField-11")).sendKeys("Malvern");
//		
//		driver.findElement(By.cssSelector("select#RESULT_RadioButton-12 > option")).click();
//		
//		driver.findElement(By.id("RESULT_TextField-13")).sendKeys("19355");
//		
//		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("1234567890");
//		
//		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("rajendraprasad.2k2@gmail.com");
		
		By valYear = By.id("RESULT_TextField-2");
		By vehMake = By.id("RESULT_TextField-3");
		By vehModel = By.id("RESULT_TextField-4");
		By color = By.id("RESULT_TextField-5");
		By mileage = By.id("RESULT_TextField-6");
		By vehIdenNum = By.id("RESULT_TextField-7");
		By name = By.id("RESULT_TextField-8");
		By address = By.id("RESULT_TextField-9");
		By address1 = By.id("RESULT_TextField-10");
		By city = By.id("RESULT_TextField-11");
		By state = By.cssSelector("select#RESULT_RadioButton-12 > option");
		By zip = By.id("RESULT_TextField-13");
		By phone = By.id("RESULT_TextField-14");
		By emailAddr = By.id("RESULT_TextField-15");
		
		
		
		
		doActionsSendKeys(valYear,"2022");
		doActionsSendKeys(vehMake,"Corolla,Toyota");
		doActionsSendKeys(vehModel,"K-120");
		doActionsSendKeys(color,"Metalic Gray");
		doActionsSendKeys(mileage,"20");
		doActionsSendKeys(vehIdenNum,"123345");
		doActionsSendKeys(name,"Rajendra");
		doActionsSendKeys(address,"333,Lancaster ave");
		doActionsSendKeys(address1,"apt no:307");
		doActionsSendKeys(city,"Malvern");
		doActionsSendKeys(state,"pennsylvania");
		doActionsSendKeys(zip,"19355");
		doActionsSendKeys(phone,"1234567890");
		doActionsSendKeys(emailAddr,"rajendraprasad.2k2@gmail.com");
		
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator),value).perform();
	}
	
	public static void doActionClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}

}
