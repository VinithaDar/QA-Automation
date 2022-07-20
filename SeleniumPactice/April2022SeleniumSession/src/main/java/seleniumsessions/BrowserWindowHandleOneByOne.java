package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleOneByOne {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
        
		driver.findElement(By.cssSelector("img[alt='OrangeHRM on twitter']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();
		System.out.println("parent window id:"+parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id:"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(1000);
		System.out.println("child window title:"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("parent window title:"+driver.getTitle());
		
		//2.
		
		driver.findElement(By.cssSelector("img[alt='LinkedIn OrangeHRM group']")).click();
		Thread.sleep(2000);
		
		Set<String> handles2 = driver.getWindowHandles();
		
		Iterator<String> it2 = handles2.iterator();
		
		String parentWindowId1 = it2.next();
		System.out.println("parent window id1:"+parentWindowId1);
		
		String childWindowId2 = it2.next();
		System.out.println("child window id2:"+childWindowId2);
		
		driver.switchTo().window(childWindowId2);
		System.out.println("child window title2:"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId1);
		Thread.sleep(2000);
		System.out.println("parent window title2:"+driver.getTitle());
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
