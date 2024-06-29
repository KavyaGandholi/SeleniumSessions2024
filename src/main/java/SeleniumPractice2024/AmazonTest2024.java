package SeleniumPractice2024;

public class AmazonTest2024 {

	public static void main(String[] args) throws Exception {

		String browser = "chrome";
		
		BrowserUtil2024 brUtil = new BrowserUtil2024();
		
		brUtil.launchBrowser(browser);
		
		brUtil.launchUrl("https://www.amazon.com");
		
		String title = brUtil.getPageTitle();
		if(title.contains("Amazon")) {
			System.out.println("correct title--PASS");
		}
		else {
			System.out.println("correct title -- FAIL");
		}
	
	
		brUtil.getPageUrl();
		brUtil.closeBrowser();
	}

}
