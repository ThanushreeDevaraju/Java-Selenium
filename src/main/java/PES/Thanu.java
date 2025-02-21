package PES;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Thanu {
	public static void main(String args[])
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	String title=driver.getTitle();
	if(title.equals("Your Store"))
			{
		System.out.println("Tst pass");
			}
	else
	{
		System.out.println("Tst pass");
	}
	driver.close();
	}
}
