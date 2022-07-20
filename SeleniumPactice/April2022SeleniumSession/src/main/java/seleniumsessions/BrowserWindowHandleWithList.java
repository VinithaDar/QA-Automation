package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleWithList {
        
	     static WebDriver driver;
	 
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
        
		driver.findElement(By.cssSelector("img[alt='OrangeHRM on twitter']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		//set to List
		List<String> handlesList = new ArrayList<String>(handles);
		
		String parentWindowId = handlesList.get(0);
		System.out.println("parent window id:"+parentWindowId);
		
		String childWindowId = handlesList.get(1);
		System.out.println("child window id:"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child Window url:"+ driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url:"+ driver.getCurrentUrl());
        System.out.println("parent window title:"+driver.getTitle());
        
        driver.quit();
	
		
		

	}

}
