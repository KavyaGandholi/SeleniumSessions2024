package SeleniumPractice2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MupltiplElementsConcept2024 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

//		for single webElement =  findElement -- return WebElement
//		for multiple webelements =  findElements -- return List<WebElement>
//		eg: total no. of links/images available on page
		// print the text of each link on console
		// but do not print the blank values

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		driver.wait(5000);

		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("total links" + linksList.size());

//		for(int i=0; i<linksList.size(); i++) {
//			String text = linksList.get(i).getText();
//			
//			if(text.length()!= 0) { 
//			System.out.println(text);
//		}
//				
//	}
		// to cpature text without spaces/blanks -- text.length!= 0
		for (WebElement e : linksList) {
			String text = e.getText();
			if (text.length() != 0) {
				System.out.println(text);
			}
			String hrefValue = e.getAttribute("href"); //total no of links on the page
			System.out.println(hrefValue);

		}
		
		

	}
}
