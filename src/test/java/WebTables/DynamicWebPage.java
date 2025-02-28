package WebTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebPage {
	public static void main(String args[]) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	
	WebElement ab=driver.findElement(By.xpath("//ul[@id='pagination']"));
	List<WebElement> ls=ab.findElements(By.tagName("li"));
	
	System.out.println(ls.size());
	
	
	for(int i=1;i<=ls.size();i++)
	{
		String data=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td[2]")).getText();
		System.out.println(data);
		
	}
	
//     WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
//	 WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
//	 
//	 user.clear();
//	 pass.clear();
//	 Thread.sleep(3000);
//	 user.sendKeys("demo");
//	 pass.sendKeys("demo");
//	
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//To click on customers---//a[@class='parent']
	
		//driver.findElement(By.xpath("//a[@class='parent']")).click();
        //driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customer')]")).click();
        
	}
	
	
}
