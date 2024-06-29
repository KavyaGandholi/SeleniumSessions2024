package SeleniumPractice2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeFullScreen2024 {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Venkatesh PC\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//to maximize window:
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
//		//to full screen window
//		driver.manage().window().fullscreen();//-- but will not give exact fit to the screen
//		driver.get("https://www.google.com");

		// there is no use case of minimizing window though eclipse provides minimize() option
		
		
	}

}
