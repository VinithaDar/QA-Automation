package seleniumsessions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsRefreshPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naveenautomationlabs.com");
        Thread.sleep(4000);
        Actions action = new Actions(driver);
		//action.keyDown(keys.COMMAND).sendKeys("r").keyUp(Keys.COMMAND).build().perform();//it will do refresh the page
	    
		action.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();//this line also refresh the page
		//action.keyDown(Keys.CONTROL).sendKeys(keys.F5).keyUp(Keys.CONTROL).build().perform();
	    //keys.Down - it will pressing  the key
		//keys.Up - it will release the key
		//COMMAND is in mac, CONTROL is in windows
	}

}
