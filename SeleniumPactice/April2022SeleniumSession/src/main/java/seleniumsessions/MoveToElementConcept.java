package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		WebElement parentMenu = driver.findElement(By.className("meganav-shop"));
		Actions act = new Actions(driver);
		act.moveToElement(parentMenu).perform();
		Thread.sleep(2000);
	    driver.findElement(By.linkText("https://www.bigbasket.com/cl/beverages/?nc=nb")).click();

	}

}

//class="dropdown-toggle meganav-shop"
//class="icon svg-header svg-arrow-down-hover svg-arrow-down-hover-dim"