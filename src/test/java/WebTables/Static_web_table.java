package WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_web_table {
public static void main(String args[])
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	//To find number of rows
	int Rsize=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	System.out.println(Rsize);
	
	//To find number of columns
	int Csize=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	System.out.println(Csize);
	
	//To read data from Table and column
	for(int i=2;i<=Rsize;i++)
	{
		for(int j=1;j<=Csize;j++)
		{
			String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
			System.out.print(data+"\t");
		}
		System.out.println();
	}
	
	//To add all the price
	
	int total=0;
		for(int j=1;j<=Rsize;j++)
		{
			String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+j+"]//td[4]")).getText();
			total=total+Integer.parseInt(data);
		
	}
	
	
	
	
	
}
}
