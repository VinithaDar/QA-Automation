package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheckbox {
         
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		selectUserName("Garry.White");
		selectUserName("Jasmine.Morgan");
		System.out.println(getUserName("Garry.White"));
	}

	public static void selectUserName(String userName) {
		
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
		.click();
	}
	
	public static String getUserName(String userName) {
	
	String userRole = driver.findElement(By.xpath("//a[text()='Garry.White']/parent::td/forward-sibling::td")).getText();
	
	return userName;
	}
	
	
}
