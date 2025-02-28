package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class conformationAlert 
{
	public static void main(String args[])
	{
	WebDriver driver=new ChromeDriver();

	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	driver.switchTo().alert();
	
	//To accept alert
	driver.switchTo().alert().accept();
       
	//To reject alert
	driver.switchTo().alert().dismiss();
}
}
