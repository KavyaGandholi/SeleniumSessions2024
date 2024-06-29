package SeleniumPractice2024;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {
	
	public static void main(String[] args) {
		
		//browser language-- Java Script
		//Selenium doen't allow scrolling, shadowDOM etc methods-- so w euse JavaScript
		

		System.getProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh PC\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("alert('hello')");
		
	}

}
