package SeleniumPractice2024;

import java.nio.file.spi.FileSystemProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserLogic2024 {

	
	static WebDriver driver;
	
	public static void main(String[] args) {

		//chrome 
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh PC\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");		
//		WebDriver driver = new ChromeDriver();
		
		//firefox
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh PC\\Drivers\\Geckodriver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//	
		//give a switch case:
		//CrossBrowser Logic:
		
		String browser = "CHrome";
		//if i want to use capital letters/no lettercase we use browser.toLowerCase() method	
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh PC\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh PC\\Drivers\\Geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;	
		
		case "safari":
			driver = new SafariDriver();
			break;
		
		default:
			System.out.println("Please give right browser");
			break;
		}
				
		
		driver.get("https://www.google.com");

		String title = driver.getTitle();
		System.out.println("page title:" + title);
		
		String url = driver.getCurrentUrl();
		System.out.println("current url is : " +url);
		
		driver.quit();
	
	}

}
