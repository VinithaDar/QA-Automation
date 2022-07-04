package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {
         
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//
		//findElement(By.xpath("//a[text()='"+footerLinkText+"']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
		//By.xpath("((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]");
		
		System.out.println(getHeaderValue("Carrers"));
		System.out.println(getHeaderValue("Advertise Your Products"));
		
		
	}	
		
		public static String getHeaderValue(String footerLinkText) {
			
		String header = driver.findElement(By.xpath("//a[text='"+footerLinkText+"']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
				.getText();
		
		return header;
		
		
		//}
		
		
		
		
		
		
	}

}
