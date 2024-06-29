package SeleniumSelfPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	WebDriver driver;
	// we write methods for LaunchBrowser, LaunchUrl, getPageTitle, getPageUrl,

	public WebDriver launchBrowser(String browser) {
		System.out.println("browser name is : " + browser);

		switch (browser) {
		case "chrome":
			// System.setProperty("WebDriver.driver.chrome", "C:\\Users\\Venkatesh
			// PC\\Drivers\\chromedriver-win64\\chromedriver.exe")
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			// System.setProperty("WebDriver.driver.chrome", "C:\\Users\\Venkatesh
			// PC\\Drivers\\chromedriver-win64\\chromedriver.exe")
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "Edge":
			// System.setProperty("WebDriver.driver.chrome", "C:\\Users\\Venkatesh
			// PC\\Drivers\\chromedriver-win64\\chromedriver.exe")
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass correct browser");
			//throw new Exception("WRONGBROWSER");
			//break;
		}
		return driver;
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
		System.out.println("page title is : " + title);

		if (title != null) {
			return title;
		} else {
			System.out.println("getting null url");
			return null;
		}

	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("the current Url is: " + url);

		if (url != null) {
			return url;
		} else {
			System.out.println("url is null");
			return null;
		}
	}
}
