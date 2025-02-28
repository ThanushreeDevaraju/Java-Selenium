package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//To select single option
		driver.findElement(By.xpath("//input[@value='Bootstrap']")).click();
		
	}
}
