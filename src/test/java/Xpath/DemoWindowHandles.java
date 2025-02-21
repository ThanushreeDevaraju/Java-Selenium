package Xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWindowHandles {
	
	public static void main(String args[]) throws Exception
	{
		WebDriver driver=new ChromeDriver(); 
		
		//open url on browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(10000);
		
		//Linked 
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//To get ID of Multiple Browser
		Set<String> ap=driver.getWindowHandles();
		System.out.println(ap);
		
		
		
		
	}
}
