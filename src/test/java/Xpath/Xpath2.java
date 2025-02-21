package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpath2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.opencart.com/"); 
		driver.manage().window().maximize();
		
		//x-path for inner and linked  text-text()
		//driver.findElement(By.xpath("//*[text()='Desktops']")).click();
		
	//	driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		
		boolean val=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(val);
	}

}
