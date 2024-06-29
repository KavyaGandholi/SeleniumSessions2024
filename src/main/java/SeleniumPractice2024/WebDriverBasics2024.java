package SeleniumPractice2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics2024 {

	public static void main(String[] args) {

	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh PC\\Drivers\\Geckodriver\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh PC\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");		
		
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println("page title:" + title);
	
		//verification:
		if(title.equals("Google")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println("current url is : " +url);
	
//		String source = driver.getPageSource();
//		System.out.println("Page Source is" +source);
//		if(source.contains("SPDX-License-Identifier: Apache-2.0")) {
//			System.out.println("Pass");
//		}
		
		//close the browser:
		driver.quit();
		//driver.close();
	}

}
