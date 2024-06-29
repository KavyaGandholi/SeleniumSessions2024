package SeleniumPractice2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessIncognitoConcept {

	public static void main(String[] args) {
		
		//headless-- no browser
		//testing happens in the background without any display browser
		//faster than normal mode
		
		//always avoid headless as it doen't give proper result
		//it is helpful while writing the email, also run other test cases
		
		WebDriverManager.chromedriver().setup();
		
		//chromeoptions class sets headless method
		
		ChromeOptions co = new ChromeOptions();
		
//		co.addArguments("--headless"); //-- launch browser in headless mode without opening browser
		
		co.addArguments("--incognito");  //launch browser incognito mode
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
