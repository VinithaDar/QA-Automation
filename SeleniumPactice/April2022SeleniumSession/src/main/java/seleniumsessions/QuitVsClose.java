package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Medepalle\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		String title = driver.getTitle();
		System.out.println("page title is :"+title);
		
		if(title.equals("Your Store")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//if(url.contains("opencart")){
		//	System.out.println("correct url");
		//}
		//else {
		//	System.out.println("incorrect url");
		//}
		
		driver.close();

	}

}
