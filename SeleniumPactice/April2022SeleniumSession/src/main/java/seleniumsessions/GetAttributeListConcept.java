package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeListConcept {
       static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
//		List<WebElement> linksList = driver.findElements(By.tagName("a"));
//      
//		for(WebElement e: linksList) {
//			String hrefVal = e.getAttribute("href");
//			System.out.println(hrefVal);
//	}
//	}}
//		
		By links = By.tagName("a");
		By images = By.tagName("img");
//		
		System.out.println(getEleAttributeList(links, "href"));
		System.out.println(getEleAttributeList(images, "alt"));
		System.out.println(getEleAttributeList(images, "height"));
		System.out.println(getEleAttributeList(images, "src"));
	}
	
	public static List<String> getEleAttributeList (By locator, String attrName){
		List<WebElement> eleList = getElement(locator);
		List<String> eleAttrValList = new ArrayList<String>();
		for(WebElement e : eleList) {
			String attrValue =e.getAttribute(attrName);
			eleAttrValList.add(attrValue);
			
		}
		  return eleAttrValList;
		
	}

	private static List<WebElement> getElement(By locator){
		return driver.findElements(locator);
	}

}
