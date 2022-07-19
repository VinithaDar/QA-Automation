package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysCopyPaste {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/account/about");
		
		WebElement element =driver.findElement(By.xpath("//*[text()='Create an account']"));
		element.click();
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement userName = driver.findElement(By.id("username"));
		
		firstName.sendKeys("naveen");
		
		Actions act = new Actions(driver);
		
		//windows---keys.CONTROL
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();//Here keyDown means pressing 
		//the key,I gave keys.CONTROL means,pressing the CONTROL button and sending inputs 'a',it will select the naveen
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();	//Here it copy the naveen	
		
		userName.click();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();//here paste it
		
		
		
		
		
		
	}

}
