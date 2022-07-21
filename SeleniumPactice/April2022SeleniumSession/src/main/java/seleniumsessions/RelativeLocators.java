package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.ArrayList;
import java.util.List;
public class RelativeLocators {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		
//		////form[@class='form-horizontal']// input[9]
//		//WebElement baseEle = driver.findElement(By.xpath("//input[@id='input-confirm']"));
//		
//		WebElement baseEle = driver.findElement(By.xpath("//label[text()='First Name']"));
//		//String belowRadio = driver.findElement(with(By.))
//
//		String rightIndex = driver.findElement(with(By.id("input-firstname")).toRightOf(baseEle)).getText();
//		System.out.println(rightIndex);
//		
		
		driver.get("https://www.aqi.in/dashboard/canada"); //it will open the webpage
		
		WebElement baseEle = driver.findElement(By.linkText("Alberta"));//
		
	    String rightIndex = driver.findElement(with(By.tagName("td")).toRightOf(baseEle)).getText();//
		System.out.println(rightIndex);//will print right element of Alberta
		
		String belowCity = driver.findElement(with(By.tagName("a")).below(baseEle)).getText();
		System.out.println(belowCity);//will print below element of Alberta
		
		//String rightAQIUS = driver.findElement(with(By.xpath("//a[text()='Alberta']/parent::th/following::td")).toRightOf(baseEle)).getText();
		//System.out.println(rightAQIUS);
		
//		List<WebElement> list = driver.findElements(with(By.xpath("//a[text()='Alberta']/parent::th/following::td")).toRightOf(baseEle));
//		List<String> list1 = new ArrayList<String>();
//		
//		for(WebElement e : list){
//			String text = e.getText();
//			list1.add(text);
//			System.out.println(list1);
//		}
		
		String nearCity = driver.findElement(with(By.tagName("a")).near(baseEle)).getText();
		System.out.println(nearCity);
		
		
		
		List<WebElement> list = driver.findElements(with(By.tagName("a")).below(baseEle));
		 System.out.println(list.size());
		for(WebElement e : list) {
			String list1 = e.getText();
			System.out.println(list1);
		}
		
	}
}
		
		
		
		
	
		
		
		
		
		
		
	

	


