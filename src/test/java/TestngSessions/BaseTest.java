package TestngSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import SeleniumSelfPractice.BrowserUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	
	@Parameters({"url", "browser"})
	@BeforeTest
	public void setup(String url, String browser) {    //--this is run time parameter we are giving to run testng.xml one by one
//		WebDriverManager.chromedriver().setup();		
//		driver = new ChromeDriver();
		
		BrowserUtil br =  new BrowserUtil();
		driver = br.launchBrowser(browser);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
