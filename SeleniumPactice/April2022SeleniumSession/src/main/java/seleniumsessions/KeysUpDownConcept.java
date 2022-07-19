package seleniumsessions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysUpDownConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions act = new Actions(driver);
		
		//scroll down using Actions class
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();//It will go page downside, because I send input "keys.END" 
		Thread.sleep(1000);
		
		//scroll up using Actions class
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();//It will go page up, because I send input "kays.Up"
		
		
		

	}

}
