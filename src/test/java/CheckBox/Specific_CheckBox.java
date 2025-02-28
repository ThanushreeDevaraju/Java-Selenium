package CheckBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specific_CheckBox
{
public static void main(String args[])
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("document.body.style.zoom='70%'");  // Zoom out to 80%

	
	
	driver.findElement(By.xpath("//input[@id='sunday']")).click();
}
}
