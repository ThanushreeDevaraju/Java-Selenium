package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods
{
public static void main(String args[]) throws Exception
{
	WebDriver driver=new ChromeDriver(); 
	
	//open url on browser
	driver.get("https://demo.opencart.com/");
	
	//time given load page
	Thread.sleep(10000);
	//To get the title of the page
	System.out.println(driver.getTitle());
	
	//to get current URL
	System.out.println(driver.getCurrentUrl());
	
	//to get page Source
	System.out.println(driver.getPageSource());
	
	//To  get ID of single Browser
	System.out.println(driver.getWindowHandle());
	
	//Linked 
	driver.findElement(By.linkText("Tablets")).click();
	
	//To get ID of Multiple Browser
	System.out.println(driver.getWindowHandles());
	
	
	
	
}
}
