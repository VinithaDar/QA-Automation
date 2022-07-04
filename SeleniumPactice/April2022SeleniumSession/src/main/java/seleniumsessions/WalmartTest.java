package seleniumsessions;

public class WalmartTest {

	public static void main(String[] args) {
		
			
			BrowserUtil1 brUtil = new BrowserUtil1();
			brUtil.initDriver("chrome");
			
			brUtil.launchUrl("https://www.walmart.com/");
			
			if(brUtil.isUrlFractionExist("walmart")) {
				System.out.println("url is correct with walmart...PASS");
			}else {
				System.out.println("FAIL");
			}
			
			if(brUtil.isInfoExistlnPageSource("Make your pantry at Walmart, your supermarket at home."))	{
			  System.out.println("page source is correct with fraction url...PASS");
			}else {
				System.out.println("FAIL");
			}
			
			if(brUtil.getPageTitle().contains("Walmart.com | Save Money. Live Better")) {
				System.out.println("correct title ..PASS");
			}	
			else {
				System.out.println("incorrect title...FAIL");
			}
	        brUtil.quitBrowser();
		}

	

	}


