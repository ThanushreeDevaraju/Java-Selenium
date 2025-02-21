package CSS_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locator {
	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//using CSS locators
		
		//tag#id or #id
		//driver.findElement(By.cssSelector("tag#id"))
		boolean a=driver.findElement(By.cssSelector("div#logo")).isDisplayed();
		System.out.println(a);
		
		//tag.classname or .classname
		//driver.findElement(By.cssSelector("tag.class"));
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("T-shirts");
		
		//tag[attribute=value]
		//driver.findElement(By.cssSelector("tag[attribute='value']"))
		driver.findElement(By.cssSelector("img[alt='MacBook']")).click();
		
		}

}
