package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcepts {

	//private static final boolean WebElement = false;

	public static void main(String[] args) throws InterruptedException {
		
		//context click-->Right click
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

	WebElement rightClickEle =driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions act = new Actions(driver);
	
	act.contextClick(rightClickEle).perform();
		
	Thread.sleep(1500);
	
//   List<WebElement>  rightEle =  driver.findElements(By.xpath("//li[contains(@class,'context-menu-icon')]/span"));//it will give list of all
	//elements
//   
//		System.out.println(rightEle.size()); //give size of elements:6
//	
//		for(WebElement e : rightEle ) {
//			String text = e.getText();
//			System.out.println(text); //it will print all elements
//			if(text.equals("Copy")) {
//				e.click();//clicking copy button
//				break;
//           }
//		}
		
		driver.findElement(By.className("context-menu-icon-copy")).click();//worked, it is clicking copy
		
		
		
	}

}
