package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

//import io.github.*;
import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * This method is used to initialise the driver on the basis of given browser name
 * @author Rajendra Medepalle
 *
 *@param browserName
 *@return this returns driver
 */

public class BrowserUtil {
	
    private WebDriver driver;

	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is: "+browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		try {
		 if(browserName.equalsIgnoreCase("opera")){
			//System.out.println("please pass the right browser..."+browserName);
			throw new Exception("NOBROWSEREXCEPTION");
		}
		 else {
			// System.out.println("please pass the right browser..."+browserName);
			 //e.printStackTrace();
		 }
		 System.out.println("bye");
		 }
		 
		 catch(Exception e) {
			// System.out.println("please pass the right browser..."+browserName);
			 System.out.println();
		}
		
		return driver;
	}
	

	 public void launchUrl(String url) {
		 if(url==null) {
			 System.out.println("url is null...");
			 return;
		 }
		 if(url.indexOf("http")==-1) {
			 System.out.println("url is not having http...");
			 return;
		 }
		 if(url.indexOf("https")==-1) {
			 System.out.println("url is not having https...");
			 return;
		 }
		 if(url == "") {
			 System.out.println("url is blank....");
			 return;
		 }
			
		 driver.get(url);
		 }
	 
	 /**
		 * this method is used to return the page title
		 * 
		 * @return
		 * @param url
		 */
	 
	 public String getPageTitle() {
		 String title = driver.getTitle();
		 System.out.println("page title is: "+title);
		 return title;
	 }
	 
	 public String getPageUrl() {
		 String url = driver.getCurrentUrl();
		 System.out.println("page url is:"+url);
		 return url;
	 }
	 
	 public boolean isUrlFractionExist(String urlFraction) {
		 if(getPageUrl().contains(urlFraction)) {
			 return true;
		 }
		 return false;
	 }
	 public String getPageSource() {
		 String pageSource = driver.getPageSource();
		// System.out.println("page source is: "+pageSource);
		 return pageSource;
	 }
	 
	 public boolean isInfoExistlnPageSource(String info) {
		 if(getPageSource().contains(info)) {
			 return true;
		 }
		 return false;
	 }
	 public void closeBrowser() {
		 driver.quit();
	 }
	 public  void quitBrowser() {
		 driver.quit();
	 
	 	 }
}
