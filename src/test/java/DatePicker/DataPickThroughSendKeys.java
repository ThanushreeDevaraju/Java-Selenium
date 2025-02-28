package DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPickThroughSendKeys {
public static void main(String args[])
{
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0);
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/04/2025");
	
}
}
