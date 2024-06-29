package SeleniumPractice2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseSessionID2024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh PC\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com");
	
		String title = driver.getTitle();
		System.out.println("page title is :" +title);
		
//		//verification:
//		if(title.equals(title)) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}
		
		//close the browser:
		//driver.quit(); //session Id will be created or it will be NULL
		driver.close(); //session id will be invalid

		driver = new ChromeDriver();
		driver.get("https://www.google.com"); //new session id will be created for quit()
		System.out.println(driver.getTitle());
		
		driver.quit();
	
	
	
	
	}

}
