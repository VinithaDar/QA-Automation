package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil1 {
	
	private WebDriver driver;
	
	
	/**
	 * This method is used to intialize the driver on the basis of name
	 * 
	 * @param browserName
	 * @return this returns driver
	 */
	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is: "+browserName);
		
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		
	    case "firefox":
		    WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		    break;
		    
	    case "safari":
			driver = new SafariDriver();
			break;
			
	    case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;	

		default:
			System.out.println("please pass the right browser...."+browserName);
			break;
		}
		return driver;
	}
	
	/**
	 * 
	 * This method is used to launch Url
	 * @param url
	 */
		
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
		 driver.get(url);
	    }
		
    /**
	 * this method is used to return the page title
	 * 
     */
	   
	   public String getPageTitle() {
		  String title = driver.getTitle();
		  System.out.println("page title is: "+title);
		return title;
	   }
	   
	   public String getPageUrl() {
		   String url = driver.getCurrentUrl();		
		   System.out.println("page url is: "+ url);
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
	 
