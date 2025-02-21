package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//X-path for single attribute
		driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("T-shirt");
		
		//X-path for Multiple attribute
		driver.findElement(By.xpath("//*[@placeholder='Search'][@name='search']")).sendKeys("T-shirt");
		
		//X-path for Multiple attribute along with and operation among attribute
		driver.findElement(By.xpath("//*[@placeholder='Search'or @name='search']")).sendKeys("T-shirt");
		
		//X-path for Multiple attribute along with or operation among attribute
		driver.findElement(By.xpath("//*[@placeholder='Search'and @name='search']")).sendKeys("T-shirt");
		
		
	}

}
