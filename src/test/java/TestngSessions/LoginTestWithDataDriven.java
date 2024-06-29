package TestngSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithDataDriven {

	//data driven approach
	//testNG data provider approaches:
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@DataProvider
	public Object[][] getNegativeLoginData() {
		
		return new Object[][] {
			
			{"kavya@gmail.com", "12345"},
			{"kavya@gmail.com" , "test@msk"},
			{"kavya" , "43589537"},
			{"tom@gmail.com" , "@#@#@3"},
			{"   " , "   "}
		}; 
	}
	
	@Test(dataProvider = "getNegativeLoginData" )
	public void LoginNegativetest(String username, String password) {
		Assert.assertEquals(doLogin(username, password), true);
		
	}
	
	public boolean doLogin(String username, String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		return driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).isDisplayed();
		
		//to validate the error msg
		
//		String errMsg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
//		System.out.println(errMsg);
//		
//		if(errMsg.contains("No match for E-Mail Address and/or Password.")) {
//			return true;
//		}
//		else {
//			return false;
//		}
		
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
