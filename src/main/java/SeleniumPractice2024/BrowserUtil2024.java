package SeleniumPractice2024;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil2024 {

	private WebDriver driver;

	/**
	 * this method is used to initialize the drive on the basis of browser(chrome,
	 * firefox etc)
	 * 
	 * @param browser
	 * @throws Exception 
	 */

	public WebDriver launchBrowser(String browser) throws Exception {
		System.out.println("browser name is : " + browser);

		// if i want to use capital letters/no lettercase we use browser.toLowerCase()
		// method
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("Webdriver.chrome.driver",
					"C:\\Users\\Venkatesh PC\\Drivers\\chromedriver-win64\\chromedriver.exe");
						//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh
			// PC\\Drivers\\Geckodriver\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please give right browser");
			throw new Exception("WRONGBOWSER");
			//break;
		}
		return driver;
	}

	//overload URL method:
	public void launchUrl(URL url) throws Exception {
		
		String newUrl = String.valueOf(url);
		
		if (newUrl == null) {
			System.out.println("url is null");
			throw new Exception("URLISNULL");
		}

		if (newUrl.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}
		// http(s)-- missing exception -- homework

		if (newUrl.indexOf("http") != 0 || newUrl.indexOf("https") != 0) {
			System.out.println("http(s) is missing in the url");
			//throw new Exception("HTTP(S)MISSINGEXCEPTION");
		}

		driver.navigate().to(url);
	}

	public void launchUrl(String url) throws Exception {

		if (url == null) {
			System.out.println("url is null");
			throw new Exception("URLISNULL");
		}

		if (url.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}
		// http(s)-- missing exception -- homework

		if (url.indexOf("http") != 0 || url.indexOf("https") != 0) {
			System.out.println("http(s) is missing in the url");
			throw new Exception("HTTP(S)MISSINGEXCEPTION");
		}

		driver.navigate().to(url);
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("page title :" + title);

		if (title != null) {
			return title;
		} else {
			System.out.println("getting null title");
			return null;
		}

	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("current url is : " + url);

		if (url != null) {
			return url;
		} else {
			System.out.println("getting null url");
			return null;
		}
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
			System.out.println("browser is closed");
		}
	}
}