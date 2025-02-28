package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert 
{
	public static void main(String args[]) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();

	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	Alert alerts=driver.switchTo().alert();
	alerts.sendKeys("Hello");
	
	Thread.sleep(5000);
	
	alerts.accept();
	//alerts.dismiss();

	}
}
