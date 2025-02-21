package CSS_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locator {
	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//using CSS locators
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		}

}
