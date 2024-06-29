package SeleniumPractice2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/");
		
		//to cpature text inside the frame
		//driver.switchTo().frame(2); //frame is a webelement with count of frames
		driver.switchTo().frame("main"); //give frame value as name="main"
		driver.switchTo().frame(driver.findElement(By.name("main"))); //give frame as webelement
		
		
		String header = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(header);
	}

}
