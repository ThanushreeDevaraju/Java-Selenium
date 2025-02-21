package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//isDispalyed
		//To know logo displayed or not
		boolean display=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(display);
		
		//another way for isDisplayed
		WebElement displays=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("status of logo "+displays.isDisplayed());
		
		//isEnabled
		boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(status);
		
		boolean status1=driver.findElement(By.xpath("//button[@name='register-button']")).isEnabled();
		System.out.println(status1);
		
		//Before selection
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		//to click radio button
		male.click();
		System.out.println("after selecting male radio button");
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		//radio button testing.
		WebElement radio=driver.findElement(By.xpath("//input[@name='Newsletter']"));
		System.out.println(radio.isSelected());
		radio.click();
		System.out.println(radio.isSelected());
		
		
	}

}
