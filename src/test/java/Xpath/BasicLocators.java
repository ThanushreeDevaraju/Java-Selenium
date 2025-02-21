package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Basic locators
		
		//id
		boolean isdis=driver.findElement(By.id("logo")).isDisplayed();
     	System.out.println(isdis);
     	
     	//class
     	driver.findElement(By.name("search")).sendKeys("T-shirt");
				
		//LinkedList
		driver.findElement(By.linkText("Tablets")).click();
		
		
		//partial LinkedList
		driver.findElement(By.partialLinkText("Produc")).click();
		
		//class name
		List<WebElement> th= driver.findElements(By.className("list-inline-item"));
		System.out.println(th.size());
		
		//Tagname
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		List<WebElement> lt=driver.findElements(By.tagName("img"));
		System.out.println(lt.size());
			}


}
