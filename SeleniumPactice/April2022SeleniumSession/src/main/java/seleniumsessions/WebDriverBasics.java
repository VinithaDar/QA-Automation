package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Medepalle\\Desktop\\Selenium Jars\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.google.com");
       String title = driver.getTitle();
       System.out.println("page title is: "+title); 
       
       //verification point/check point/assertion/act vs expect result
       if(title.equals("Google")) {
    	   System.out.println("correct title");
       }
       else {
    	   System.out.println("incorrect title");
       }
       
       //automation steps + verification point(checkpoint) => Automation Testing
       String url = driver.getCurrentUrl();
       System.out.println(url);
       
       if(url.contains("https://www.google.com")) {
    	   System.out.println("correct url");
       }
       else {
    	   System.out.println("incorrect url");
       }
       System.out.println("Sruthi_She is very nice");
	}

}
